package com.myproject.schedulerdevelop.entity;

import com.myproject.schedulerdevelop.dto.ScheduleRequestDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Schedule extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ScheduleId;

    @Column
    private String userName;

    @Column
    private String taskTitle;

    @Column
    private String taskContent;

    public void update(ScheduleRequestDto requestDto) {
        this.userName = requestDto.getUserName();
        this.taskTitle = requestDto.getTaskTitle();
        this.taskContent = requestDto.getTaskContent();
    }


}
