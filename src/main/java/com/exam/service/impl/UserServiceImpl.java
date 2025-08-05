package com.exam.service.impl;

import com.exam.models.User;
import com.exam.models.UserRole;
import com.exam.repository.RoleRepository;
import com.exam.repository.UserRepository;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    // Creating user
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
       
       User local= this.userRepository.findByuserName(user.getUserName());
       if(local!= null){
           System.out.println("User is already there");
           throw new Exception("User already present");
       }
       else{
           //create user
           for(UserRole ur: userRoles){
               roleRepository.save(ur.getRole());
           }
           user.getUserRoles().addAll(userRoles);
           local = this.userRepository.save(user);
       }
        return local;
    }
}
