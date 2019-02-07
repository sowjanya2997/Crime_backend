package daos;

import models.User;

import java.util.Collection;

public interface UserDao extends CrudDao<User, Integer> {

    User findUserByName(String username);
    User findUserByAuthToken(String authToken);

    Collection<User> getAllUsers();
    // User Collection<User> getAllUsers();
}
