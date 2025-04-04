package com.myproject.schedulerdevelop.service;

import com.myproject.schedulerdevelop.entity.User;
import com.myproject.schedulerdevelop.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    // 속성 선언
    private final UserRepository userRepository;

    // 생성자
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 유저 저장
    @Transactional
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // 모든 유저 조회
    @Transactional
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    // 단일 유저 조회
    @Transactional
    public Optional<User> findUserById (Long id) {
        return userRepository.findById(id);
    }

    // 유저 수정 - 업데이트
    @Transactional
    public User updateUser(Long id, User user) {
        Optional<User> existingUser = userRepository.findById(id);
        if(existingUser.isPresent()) {
            User updatedUser = existingUser.get();
            return userRepository.save(updatedUser);
        } throw new RuntimeException("업데이트 할 유저가 없습니다.");
    }

    // 유저 삭제
    @Transactional
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }



}
