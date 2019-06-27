package com.haliri.israj.springboottestcoverrestdoc.repository;

import com.haliri.israj.springboottestcoverrestdoc.domain.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserRepositoryImpl implements UserRepository {

    @Override
    public List<User> findAll() {
        User user = new User();
        user.setEmail("israj.haliri@gmail.com");
        user.setUsername("israj haliri");

        return Arrays.asList(user);
    }
}
