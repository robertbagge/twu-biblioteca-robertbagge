package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by rbagge on 06/08/2015.
 */
public class UserTest {
    User user;

    @Before
    public void setUp(){
        user = new User("123-4567", "pass1234");
    }

    @Test
    public void testUserName(){
        assertEquals("123-4567", user.getLibraryNumber());
    }

    @Test
    public void testEquals(){
        assertEquals(user, new User("123-4567", "pass1234"));
    }

    @Test
    public void testValidatePassword(){
        assertTrue(user.validatePassword("pass1234"));
        assertFalse(user.validatePassword("pass123457"));
    }
}