package com.myproject.schedulerdevelop.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class ScheduleRequestDto {

    @NotNull(message = "유저명은 필수로 입력해야 합니다.")
    private String userName;

    private String taskTitle;

    private String taskContent;

}
