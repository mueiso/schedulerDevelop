package com.myproject.schedulerdevelop.repository;

import com.myproject.schedulerdevelop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
