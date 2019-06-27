package com.haliri.israj.springboottestcoverrestdoc.repository;

import com.haliri.israj.springboottestcoverrestdoc.domain.User;

import java.util.List;

public interface UserRepository {

    List<User> findAll();
}
