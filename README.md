# ▶ Scheduler Develop 프로젝트 ◀

JDK version 17

## ✅ 목적

**개선된 일정 관리 앱 만들기**

* 일정을 생성, 조회, 수정, 삭제

* 회원가입

* 로그인

↑ 위의 기능들을 구현한 개선된 일정 관리 앱을 만드는 것이 목표이다.

-----

## ✅ 주요기능

✔️ **일정 추가 (`POST`)** 

✔️ **일정 단일 조회 (`GET`)**

✔️ **일정 목록 조회 (`GET`)**

✔️ **일정 수정 (`PUT`)**

✔️ **일정 삭제 (`DELETE`)**

✔️ **회원가입**

✔️ **로그인**

-----

-----

## ✅ API 명세서

* _**Schedule**_

|     기능     | Method | Endpoint(URL) | Path Variable | Request Parameter | Request Body                                                                           | Response                                                                                                                                                 |     상태코드     |
|:----------:|:------:|:-------------:|:-------------:|:-----------------:|:---------------------------------------------------------------------------------------|:---------------------------------------------------------------------------------------------------------------------------------------------------------|:------------:|
|   스케줄 생성   |  POST  |  /schedules   |       X       |         X         | { "user_name": "유저명",<br/>"task_title": "할일 제목",<br/>"task_content": "할일 내용" }         | { "schedule_id": 1,<br/>"user_name": "유저명",<br/>"task_title": "할일 제목",<br/>"task_content": "할일 내용",<br/>"created_at": 작성된 시간,<br/>"updated_at": 수정된 시간 } |  200: 정상등록   |
| 스케줄 단건 조회  |  GET   |     /{id}     |   id (Long)   |         X         | X                                                                                      | { "schedule_id": 1,<br/>"user_name": "유저명",<br/>"task_title": 제목1,<br/>"task_content": 할 일 내용1 }                                                         |  200: 정상조회   |
| 스케줄 수정(전체) |  PUT   |     /{id}     |   id (Long)   |         X         | { "task_title": "수정된 제목",<br/>"task_content": "수정된 내용" }                               | { "schedule_id": 1,<br/>"user_name": "유저명",<br/>"task_title": "수정된 제목",<br/>"task_content": "수정된 내용",<br/>"updated_at": 수정된 시간 }                         |  200: 정상수정   |
|   스케줄 삭제   | DELETE |     /{id}     |   id (Long)   |         X         | X                                                                                      | { "msg": "일정 삭제 완료" }                                                                                                                                    |  200: 정상삭제   |

-----

* _**User**_

|     기능     | Method | Endpoint(URL) | Path Variable | Request Parameter | Request Body                                                      | Response                                                                                                         |     상태코드     |
|:----------:|:------:|:-------------:|:-------------:|:-----------------:|:------------------------------------------------------------------|:-----------------------------------------------------------------------------------------------------------------|:------------:|
|   유저 생성    |  POST  |    /users     |       X       |         X         | { "user_name": "유저명",<br/>"email": "이메일",<br/>"password": "비밀번호" } | { "user_id": 1,<br/>"user_name": "유저명",<br/>"email": "이메일",<br/>"created_at": 작성된 시간,<br/>"updated_at": 수정된 시간 } |  200: 정상등록   |
| 유저 단건 조회  |  GET   |     /{id}     |   id (Long)   |         X         | X                                                                 | { "user_id": 1,<br/>"user_name": "유저명",<br/>"email": "이메일" }                                                     |  200: 정상조회   |
| 유저 수정(전체) |  PUT   |     /{id}     |   id (Long)   |         X         | { "user_name": "수정된 유저명",<br/>"email": "수정된 이메일" }                | { "user_id": 1,<br/>"user_name": "수정된 유저명",<br/>"email": "수정된 이메일",<br/>"updated_at": 수정된 시간 }                   |  200: 정상수정   |
|   유저 삭제   | DELETE |     /{id}     |   id (Long)   |         X         | X                                                                 | { "msg": "유저 삭제 완료" }                                                                                            |  200: 정상삭제   |

-----

-----

## ✅ ERD

![Image](https://github.com/user-attachments/assets/7039b6e6-63cb-4a07-a957-8eedc86a8141)