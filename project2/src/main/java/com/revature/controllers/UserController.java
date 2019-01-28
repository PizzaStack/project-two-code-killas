package com.revature.controllers;

import com.revature.models.User;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {

    //TODO: update constructor
    public UserController(){
        getAllUsers();
    }


    public List<User> getAllUsers(){
        List<User> userList = null;

        return userList;
    }

}//EoC
