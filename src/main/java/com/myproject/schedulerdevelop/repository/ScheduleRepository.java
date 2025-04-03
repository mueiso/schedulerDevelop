package com.myproject.schedulerdevelop.repository;

import com.myproject.schedulerdevelop.entity.Schedule;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//import java.util.Optional;


/**
 * SimpleJPARepository 사용한 CRUD
 */
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {



    /*
     JPA 사용한 CRUD
     */

//    @Repository
//    @Transactional
//    public class ScheduleRepository

//    @PersistenceContext
//    private EntityManager entityManager;

//    // 스케줄 생성
//    public Schedule createSchedule(Schedule schedule) {
//
//        if (schedule.getScheduleId() != null) {
//            throw new IllegalArgumentException("새로운 스케줄 생성 시 ID를 지정할 수 없습니다.");
//        }
//        // 새로운 사용자 등록
//        entityManager.persist(schedule);
//        return schedule;
//    }
//
//    // 전체 스케줄 조회
//    @Transactional(readOnly = true)
//    public List<Schedule> findAll() {
//        return entityManager.createQuery("SELECT u FROM Schedule u", Schedule.class)
//                .getResultList();
//    }
//
//    // 스케줄 ID로 스케줄 조회
//    @Transactional(readOnly = true)
//    public Optional<Schedule> findById(Long id) {
//        Schedule schedule = entityManager.find(Schedule.class, id);
//        // schedule 변수가 null 일 수도 있고 아닐 수도 있을 때, 이를 Optional 로 감싸서 반환하는 역할
//        return Optional.ofNullable(schedule);
//    }
//
//    // 스케줄 수정 (업데이트)
//    public Schedule edit(Schedule schedule) {
//        if (schedule.getScheduleId() == null) {
//            throw new IllegalArgumentException("먼저 스케줄을 생성해주세요.");
//        }
//        return entityManager.merge(schedule);
//    }
//
//    // 스케줄 ID로 스케줄 삭제
//    public void deleteById(Long id) {
//        Schedule schedule = entityManager.find(Schedule.class, id);
//        if (schedule != null) {
//            entityManager.remove(schedule);
//        }
//    }

}



