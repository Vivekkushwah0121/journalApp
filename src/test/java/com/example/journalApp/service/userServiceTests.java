package com.example.journalApp.service;

import com.example.journalApp.Entity.User;
import com.example.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

public class userServiceTests {

    @Autowired
    private UserService userService;

    @ParameterizedTest
   @ArgumentsSource(UserArgumentsProvider.class)
    @Disabled
    public void testSaveNewUser(User user){
        assertTrue(userService.saveNewUser(user));

    }

    @Disabled
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,10,12",
            "3,3,9"
    })
    public void test(int a, int b, int expected){
        assertEquals(expected,a+b);
    }
}
