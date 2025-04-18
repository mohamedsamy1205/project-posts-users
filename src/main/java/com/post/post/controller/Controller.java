package com.post.post.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.post.post.models.Posts;
import com.post.post.models.Users;
import com.post.post.service.Services;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private Services services;

    @PostMapping("/createuser")
    public String createUser(@RequestBody Users user) {
        services.cereatuser(user);
        return "createdUser";
    }
    @GetMapping("delete")
    public String getMethodName() {
        services.deleteUser();
        return "deletedUser";
    }
    
    @PostMapping("/createpost")
    public String createPost(@RequestBody Posts post) {
        services.createPost(post);
        return "createdPost";
    }


}
