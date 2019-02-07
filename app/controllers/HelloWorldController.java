package controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class HelloWorldController extends Controller {


    public Result helloWorld() {

        return internalServerError("Hello World");

    }

    public Result helloMattias() {

        return ok("Hello Mattias");
    }

    public Result hello(String name) {

        return ok("Hello " + name + "!!!!!!");
    }

    public Result hellos(String name, Integer count) {

        if (null == count) {
            count = 0;
        }

        final StringBuffer sb = new StringBuffer();

        final String message = "Hello " + name + "\n";

        for (int i = 0; i < count; i++) {
            sb.append(message);
        }

        return ok(sb.toString());

    }

    public Result greetings() {

        final JsonNode json = request().body().asJson();

        final String firstName = json.get("first_name").asText();
        final String lastName = json.get("last_name").asText();

        final Person person = Json.fromJson(json, Person.class);

        final String message = "Hello " + person.getFirstName() + " " + person.getLastName() + " !!";

        return ok(message);

    }

    public Result me() {

        final Person me = new Person("Mattias", "Levin");

        final JsonNode json = Json.toJson(me);

        return ok(json);

    }

}
