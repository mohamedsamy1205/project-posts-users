package com.post.post.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Users {
    private Long id;
    private String name;
    @OneToMany(mappedBy = "users")
    private List<Posts> posts;

    public Users() {
    }



    public Users(Long id, String name, List<Posts> posts) {
        this.id = id;
        this.name = name;
        this.posts = posts;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Posts> getPosts() {
        return this.posts;
    }

    public void setPosts(List<Posts> posts) {
        this.posts = posts;
    }
    

}
