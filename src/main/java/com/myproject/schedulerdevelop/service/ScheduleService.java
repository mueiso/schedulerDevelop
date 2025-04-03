package com.myproject.schedulerdevelop.service;

import com.myproject.schedulerdevelop.entity.Schedule;
import com.myproject.schedulerdevelop.repository.ScheduleRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ScheduleService {

    // 속성 선언
    private final ScheduleRepository scheduleRepository;

    // 생성자 만들기
    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;  // 생성자에 의존성 주입
    }

    // 스케줄 저장
    @Transactional
    public Schedule saveSchedule() {
        Schedule schedule = new Schedule();

        // new schedule 을 저장
//            scheduleRepository.save(schedule);
            return scheduleRepository.save(schedule);
    }

    // 모든 스케줄 조회
    @Transactional
    public List<Schedule> getAllSchedule() {
//        scheduleRepository.findAll();
//        // 받는다
//        // findAll 이 List<T> 타입이기 때문에
//        List<Schedule> scheduleList = scheduleRepository.findAll();
        return scheduleRepository.findAll();
    }

    // 단일 스케줄 조회
    @Transactional
    public Optional<Schedule> findScheduleById(Long id) {
        return scheduleRepository.findById(id);
    }

    // 스케줄 삭제
    @Transactional
    public void deleteScheduleById(Long id) {
        scheduleRepository.deleteById(id);
    }


}
