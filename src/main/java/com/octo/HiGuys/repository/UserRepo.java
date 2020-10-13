package com.octo.HiGuys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.octo.HiGuys.models.User;
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
