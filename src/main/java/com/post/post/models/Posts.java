package com.post.post.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "posts")
@Getter
@Setter
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;
    @Column(name = "username")
    private String username;

    @ManyToOne
    @JoinColumn(name = "username", insertable = false, updatable = false)
    private Users user;

    
    
    
}

    