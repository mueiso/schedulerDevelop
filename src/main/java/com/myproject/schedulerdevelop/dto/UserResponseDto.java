package com.myproject.schedulerdevelop.dto;

import com.myproject.schedulerdevelop.entity.User;
import lombok.Getter;

@Getter
public class UserResponseDto {
    private Long id;
    private String userName;
    private String email;

    public UserResponseDto(User user) {
        this.id = user.getUserId();
        this.userName = user.getUserName();
        this.email = user.getEmail();
    }
}
