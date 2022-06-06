package com.example.htmlcurd.UserController;

import com.example.htmlcurd.User;
import com.example.htmlcurd.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET ,value="/user")
    public List<User> users(){
        return userService.getallUser();
    }

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable String id){
        return userService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.POST ,value="/user")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT ,value="/user/{id}")
    public void addUser(@RequestBody User user,@PathVariable String id){
        userService.updateUser(id, user);
    }

    @RequestMapping(method=RequestMethod.DELETE,value="/user/{id}")
    public void deleteUser(@PathVariable String id){
        userService.deleteUser(id);
    }

}
