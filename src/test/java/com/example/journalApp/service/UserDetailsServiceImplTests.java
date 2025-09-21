package com.example.journalApp.service;

import com.example.journalApp.Entity.User;
import com.example.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;

import static org.mockito.Mockito.*;


public class UserDetailsServiceImplTests {
    @InjectMocks
    private UserDetailsServiceImpl userDetailsService;



    @BeforeEach
    @Disabled
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    private UserRepository userRepository;
    @Test
    @Disabled
    void loadUserByUsername(){
    when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().userName("ram").password("inrinrick").roles(new ArrayList<>()).build());
        UserDetails user = userDetailsService.loadUserByUsername("ram");
        Assertions.assertNotNull(user);
    }
}
