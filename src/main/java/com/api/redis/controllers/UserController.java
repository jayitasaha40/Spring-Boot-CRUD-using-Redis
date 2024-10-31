package com.api.redis.controllers;

import com.api.redis.dao.UserDao;
import com.api.redis.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController
{
    @Autowired
    private UserDao userDao;

    //Create New User
    @PostMapping
    public User createUser(@RequestBody User user){
        user.setUserId(UUID.randomUUID().toString());
        return userDao.save(user);
    }

    //Get Single User
    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") String userId){
        return userDao.getUser(userId);
    }

    //Find All
    @GetMapping
    public Map<Object,Object> getAll(){
        return userDao.findAll();
    }

    //Update
    @PutMapping("/{userId}")
    public User update(@PathVariable("userId") String userId, @RequestBody User user){
        user.setUserId(userId);
        return userDao.update(user);
    }

    //Delete
    @DeleteMapping("/{userId}")
    public void delete(@PathVariable("userId") String userId){
        userDao.delete(userId);
    }
}
