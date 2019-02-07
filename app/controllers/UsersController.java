package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.io.BaseEncoding;
import controllers.security.Authenticator;
import controllers.security.IsAdmin;
import daos.UserDao;
import models.User;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.db.jpa.Transactional;
import org.apache.commons.lang3.RandomStringUtils;

import javax.inject.Inject;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Optional;



public class UsersController extends Controller {

    private final static Logger.ALogger LOGGER = Logger.of(UsersController.class);
   // private final static int HASH_ITERATIONS = 100;

    private UserDao userDao;

    @Inject
    public UsersController(UserDao userDao) {

        this.userDao = userDao;
    }

    @Transactional
    public Result registerUser() {

        final JsonNode json = request().body().asJson();
        final User user = Json.fromJson(json, User.class);

        LOGGER.debug("User name is  = " + user.getUsername());
       // LOGGER.error("This is an error");

        if (null == user.getUsername()
                ) {
            return badRequest("Missing mandatory parameters");
        }



        final String password = json.get("password").asText();
        if (null == password) {
            return badRequest("Missing mandatory parameters");
        }

       /* if (null != userDao.findUserByName(user.getUsername())) {
            return badRequest("User taken");
        }
*/
      /*  final String salt = generateSalt();

        final String hash = generateHash(salt, password, HASH_ITERATIONS);

        user.setHashIterations(HASH_ITERATIONS);
        user.setSalt(salt);
        user.setPasswordHash(hash);
        */
        user.setState(User.State.VERIFIED);
        user.setRole(User.Role.USER);

      /*  userDao.create(user);

        final JsonNode result = Json.toJson(user);
        */

        final User newUser = userDao.create(user);

        final JsonNode result = Json.toJson(newUser);

        return ok(result);
    }

    /*private String generateSalt() {

        // TODO Generate random string

        return "ABC";
    }
    *

    private String generateHash(String salt, String password, int iterations) {
        try {

            final String contat = salt + ":" + password;

            // TODO Run in a loop x iterations
            // TODO User a better hash function
            final MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(contat.getBytes());
            final String passwordHash = BaseEncoding.base16().lowerCase().encode(messageDigest);

            LOGGER.debug("Password hash {}", passwordHash);

            return passwordHash;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    */

    public Result signInUser() {

        final JsonNode json = request().body().asJson();

        final String username = json.get("username").asText();
        final String password = json.get("password").asText();

        if (null == password || null == username) {
            return badRequest("Missing mandatory parameters");
        }

        final User existingUser = userDao.findUserByName(username);

        if (null == existingUser) {
            return unauthorized("Wrong username");
        }
/*
        final String salt = existingUser.getSalt();
        final int iterations = existingUser.getHashIterations();
        final String hash = generateHash(salt, password, iterations);

        if (!existingUser.getPasswordHash().equals(hash)) {
            return unauthorized("Wrong password");
        }
        */

        if(!existingUser.getPassword().equals(password)) {
            return unauthorized("Wrong password!");
        }


        if (existingUser.getState() != User.State.VERIFIED) {
            return unauthorized("Account not verified");
        }

        existingUser.setAccessToken(generateAccessToken());

        userDao.update(existingUser);

        final JsonNode result = Json.toJson(existingUser);

        return ok(result);
    }

    private String generateAccessToken() {

        // TODO Generate a random string of 20 (or more characters)

        //return "ABC1234";
        String authToken = RandomStringUtils.randomAlphabetic(10);
        return authToken;
    }

    @Authenticator
    public Result signOutUser() {

        final User user = (User) ctx().args.get("user");

        user.setAccessToken(null);

        userDao.update(user);

        return ok();
    }

    @Authenticator
    //@IsAdmin
    public Result getCurrentUser() {

        final User user = (User) ctx().args.get("user");
        
        final JsonNode result = Json.toJson(user);

        return ok(result);
    }

    @Transactional
    public Result getAllUsers() {

        Collection<User> users = userDao.all();

        final JsonNode result = Json.toJson(users);

        return ok(result);
    }



}
