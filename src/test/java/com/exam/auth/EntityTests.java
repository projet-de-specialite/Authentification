package com.exam.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.exam.auth.models.User;

public class EntityTests {

    @Test
    public void getAndSetPassword() {
        User testUser = new User();

        testUser.setPassword("mypassword");
        assertEquals(testUser.getPassword(), "mypassword");
    }

    @Test
    public void getAndSetName() {
        User testUser = new User();

        testUser.setUsername("chorouq");
        assertEquals(testUser.getUsername(), "chorouq");
    }

    @Test
    public void getAndSetEmail() {
        User testUser = new User();

        testUser.setEmail("chorouq@email.com");
        assertEquals(testUser.getEmail(), "chorouq@email.com");
    }

    @Test
    public void checkToString() {
        User testUser = new User();

        assertNotNull(testUser.toString());
    }

    @Test
    public void checkConstructor() {
        User testUser = new User("chorouq", "chorouq@email.com", "123");

        User checkUser = new User();
        checkUser.setUsername("chorouq");
        checkUser.setEmail("chorouq@email.com");
        checkUser.setPassword("123");

        assertEquals(testUser.getUsername(), checkUser.getUsername());
        assertEquals(testUser.getEmail(), checkUser.getEmail());
        assertEquals(testUser.getPassword(), checkUser.getPassword());
    }

    @Test
    public void testDefaultConstructor() {
        User testUser = new User();

        assertNotNull(testUser);
    }

}
