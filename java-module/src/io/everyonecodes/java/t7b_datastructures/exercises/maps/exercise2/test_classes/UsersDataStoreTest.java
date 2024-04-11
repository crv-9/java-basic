package io.everyonecodes.java.t7b_datastructures.exercises.maps.exercise2.test_classes;

import io.everyonecodes.java.t7b_datastructures.exercises.maps.exercise2.data_classes.User;
import io.everyonecodes.java.t7b_datastructures.exercises.maps.exercise2.service_classes.UsersDataStore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersDataStoreTest {

    UsersDataStore store = new UsersDataStore();

    @Test
    void getUserByUsername(){
        String test_username = "user2";

        User result = store.getUserByUsername(test_username);

        User expected = new User("user2", "password2");

        assertEquals(expected, result);
    }
}
