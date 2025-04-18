package com.post.post.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.post.post.models.Users;

public interface UserRepo extends JpaRepository<Users, Long> {
    

}
