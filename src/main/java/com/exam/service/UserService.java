package com.exam.service;

import com.exam.models.User;
import com.exam.models.UserRole;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface UserService  {

    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;
}
