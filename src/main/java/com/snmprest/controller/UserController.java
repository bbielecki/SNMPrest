package com.snmprest.controller;

import com.snmprest.entity.User;
import com.snmprest.entity.request.AddUserRequest;
import com.snmprest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Bartłomiej on 28.12.2016.
 */

@RestController
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository ur){
        this.userRepository = ur;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAllusers(){
        return userRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addUser(@RequestBody AddUserRequest addUserRequest){
        User user = new User();
        user.setName(addUserRequest.getName());
        user.setSurname(addUserRequest.getSurname());
        userRepository.save(user);
    }
}
