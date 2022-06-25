package org.example.rest.controller;

import org.example.rest.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public String saveUser(User user){
        return "saveUser";
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public String updateUser(User user){
        return "updateUser";
    }

    @RequestMapping(value="/delete", method = RequestMethod.DELETE)
    public String deleteUser(int user_id){
        return "deleteUser";
    }
}
