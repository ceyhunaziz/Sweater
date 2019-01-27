package com.example.sweater.repos;

import com.example.sweater.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by User on 27.01.2019.
 */
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);



}
