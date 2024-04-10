package io.everyonecodes.java.t7b_datastructures.exercises.maps.exercise2.service_classes;

import io.everyonecodes.java.t7b_datastructures.exercises.maps.exercise2.data_classes.User;

import java.util.HashMap;
import java.util.Map;

public class UsersDataStore {
    private Map<String, User> users;
    public UsersDataStore() {
        users = new HashMap<>();

        users.put("user1", new User("user1", "password1"));
        users.put("user2", new User("user2", "password2"));
    }
    public User getUserByUsername(String user){
        return users.get(user);
    }
}
