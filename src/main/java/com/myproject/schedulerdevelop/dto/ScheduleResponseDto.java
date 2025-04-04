package com.myproject.schedulerdevelop.dto;

import com.myproject.schedulerdevelop.entity.Schedule;
import lombok.Getter;

@Getter
public class ScheduleResponseDto {

    private Long ScheduleId;

    private String userName;

    private String taskTitle;

    private String taskContent;

    public ScheduleResponseDto(Schedule schedule) {
        this.ScheduleId = schedule.getScheduleId();
        this.userName = schedule.getUserName();
        this.taskTitle = schedule.getTaskTitle();
        this.taskContent = schedule.getTaskContent();
    }

}
