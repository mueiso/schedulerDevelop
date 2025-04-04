package com.myproject.schedulerdevelop.controller;

import com.myproject.schedulerdevelop.dto.ScheduleRequestDto;
import com.myproject.schedulerdevelop.dto.ScheduleResponseDto;
import com.myproject.schedulerdevelop.entity.Schedule;
import com.myproject.schedulerdevelop.service.ScheduleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {

//    // 선언
//    private ScheduleService a;
//
//    // 생성사 만들기
//    public ScheduleController(ScheduleService b) {
//        // 의존성 주입
//        this.a = b;
//    }

    //선언
    private final ScheduleService scheduleService;

    // 생성자 만들기
    public ScheduleController(ScheduleService scheduleService) {
        // 의존성 주입
        this.scheduleService = scheduleService;
    }

    // 스케줄 생성
    @PostMapping
    public ResponseEntity<Schedule> createSchedule (@RequestBody Schedule schedule) {
        Schedule savedSchedule = scheduleService.saveSchedule(schedule);
        return new ResponseEntity<>(savedSchedule, HttpStatus.CREATED);
    }

    // 전체 스케줄 조회
    @GetMapping
    public ResponseEntity<List<Schedule>> getAllSchedules() {
        List<Schedule> scheduleList = scheduleService.findAllSchedule();
        return new ResponseEntity<>(scheduleList, HttpStatus.OK);
    }

    // 단일 스케줄 조회
    @GetMapping("/{id}")
    public ResponseEntity<Schedule> getScheduleById(@PathVariable Long id) {
        Optional<Schedule> schedule = scheduleService.findScheduleById(id);
        if (schedule.isPresent()) {
            return new ResponseEntity<>(schedule.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // 스케줄 수정 (업데이트)
    @PutMapping ("/{id}")
    public ResponseEntity<ScheduleResponseDto> updateSchedule (@PathVariable Long id, @RequestBody ScheduleRequestDto requestDto) {
        Schedule updatedSchedule = scheduleService.updateSchedule(requestDto, id);  // 스케줄 타입의 업데이티드스케줄 그릇에 받다
        // 리스폰스디티오 타입의 dto 그릇에 새로운 리스폰스디티오 객체 생성할 때 업뎃된 스케줄을 넣어줘서 생성
        ScheduleResponseDto responseDto = new ScheduleResponseDto(updatedSchedule);
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    // 스케줄 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSchedule (@PathVariable Long id) {
        Optional<Schedule> schedule = scheduleService.findScheduleById(id);
        scheduleService.deleteScheduleById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        /*
         * GlobalExceptionHandler 에 @RestControllerAdvice 붙이고 컨트롤러 클래스에 @RestController 붙였으니까
         * 아래의 예외 처리 필요 없는지 물어보기
         */
//        if (schedule.isPresent()) {
//            scheduleService.deleteScheduleById(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
    }





}
