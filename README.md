## 프로젝트 제목
<h1>🍏 Organic_groupware🍏</h1>
<br>
<p align="center">
  <img style="width: 400px; height: auto;" src="https://github.com/alskdteam/semi_project_java/assets/158136952/42c16634-c9cd-41a4-a8f0-a21cdc907c4a" alt="Organic logo" />
</p>
<br>

### Organic?
organic 이란? organic 은 '유기농' 이라는 뜻으로 유기농 사과 생산과 유통을 주요 사업으로 하는 회사의 효율적인 협업과 관리에 초점을 맞춘 그룹웨어 시스템을 구축하는 프로젝트 입니다.

<br>

## 목차
- [🔥 프로젝트 정보](#-프로젝트-정보)
- [👨🏻‍💻👩🏻‍💻 멤버 소개](#-멤버-소개)
- [🔎 관련 자료 및 리소스](#-관련-자료-및-리소스)
- [개발 환경](#-개발-환경)
- [📌 프로젝트 및 기능 소개](#-프로젝트-및-기능-소개)

<br>

## 🔥 프로젝트 정보
- 프로젝트: organic_groupware
- 기획 및 제작: 최규혁, 박찬우, 이도아, 전준규
- 분류: 팀 프로젝트
- 제작 기간: 2023.04.25 ~ 06.03
- 배포일: 2024.6.3
- 사용 기술: SPRING BOOT
- 문의: 564564q@naver.com


## 👨🏻‍💻👩🏻‍💻 멤버 소개

|[![](https://avatars.githubusercontent.com/u/153148788?v=4?width=200px)](https://github.com/gyuhyeok0)|[![](https://avatars.githubusercontent.com/u/167507636?v=4?width=200px)](https://github.com/poohbao) |[![](https://avatars.githubusercontent.com/u/158136952?v=4?width=200px)](https://github.com/doa0819) | [![](https://avatars.githubusercontent.com/u/109369481?v=4?width=200px)](https://github.com/rjadmsehf)|
|:---:|:---:|:---:|:---:|
| 최규혁 | 박찬우 | 이도아 | 전준규 |


## 🔎 관련 자료 및 리소스
- [테이블 설계](https://github.com/alskdteam/semi_project_java/wiki/%ED%85%8C%EC%9D%B4%EB%B8%94-%EC%84%A4%EA%B3%84)
- [피그마 설계](https://www.figma.com/design/IKAvtHhfsymAZyzUrcDyt3/Develop?node-id=0-1&t=ixCbcDKfOkSZPW7Q-0)
- [맴버 소개 및 역할](https://github.com/alskdteam/semi_project_java/wiki/%F0%9F%91%A8%F0%9F%8F%BB%E2%80%8D%F0%9F%92%BB%F0%9F%91%A9%F0%9F%8F%BB%E2%80%8D%F0%9F%92%BB-%EB%A9%A4%EB%B2%84-%EC%86%8C%EA%B0%9C-%EB%B0%8F-%EC%97%AD%ED%95%A0)


## 개발 환경
<div style="display: flex;">
  
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=OpenJDK&logoColor=white">
<img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=Spring&logoColor=white">
<img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
<img src="https://img.shields.io/badge/Spring Security-6DB33F?style=for-the-badge&logo=Spring Security&logoColor=white">
<img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=MySQL&logoColor=white">
<img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=HTML5&logoColor=white">
<img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=CSS3&logoColor=white">
<img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=white">
</div>

## 화면구성
이 프로젝트는 Bootstrap 또는 다른 프론트엔드 프레임워크를 사용하지 않고 순수 HTML과 CSS로 구성되었습니다. 맞춤화된 디자인을 통해, 간결하고 가벼운 디자인을 유지하면서도 사용자 경험을 중시했습니다.

## 사용한 API
Fullcalendar

## 로그인 자격 증명 목록
- **관리자 계정**
  - 아이디: 2001
  - 비밀번호: [2001]

- **일반 사원용 계정**
  - 아이디: 2002
  - 비밀번호: [2002]
 
<br>

## 📌 프로젝트 및 기능 소개

### 1.로그인
![화면 기록 2024-06-02 오후 6 52 37](https://github.com/alskdteam/Organic_groupware/assets/153148788/1cd9c10c-1f2b-460e-8035-321831e1f639)

- 사용자는 지정된 번호로만 로그인할 수 있습니다. 회원가입은 관리자가 처리합니다.
- Spring Security를 사용하여 잘못된 아이디 또는 비밀번호를 입력할 경우 로그인이 거부됩니다.
- 로그인 성공시, 사용자의 프로필 정보가 사이드바에 나타납니다.
- 사용자의 권한에 따라 사이드바에 적절한 메뉴가 표시됩니다.
- Admin으로 로그인한 경우에는 관리 기능 메뉴가 추가됩니다.
- 관리 기능 버튼을 클릭하면, 관리자 전용 페이지로 이동합니다.
- 로그아웃 버튼을 클릭하면 현재 세션을 종료하여 로그아웃됩니다.

### 2. 출퇴근
![출퇴근](https://github.com/alskdteam/Organic_groupware/assets/153148788/89c2e87c-cad8-430b-97d9-1c99244bcc43)

- 유저는 사이드바에서 출퇴근 버튼을 통해 출근 및 퇴근을 기록할 수 있습니다.
- 버튼을 클릭하면, 클라이언트에서는 현재 날짜와 시간을 서버로 전송합니다.
- 서버에서는 받은 데이터를 주어진 형식에 맞게 처리하여 데이터베이스에 출근 시간 및 퇴근 시간을 저장합니다.
- 서버는 현재 날짜를 기준으로 해당 정보를 뷰포트에 다시 표시합니다.

### 3. 공지사항
![공지사항](https://github.com/alskdteam/Organic_groupware/assets/153148788/5c8fc9d5-44ea-4eeb-ad3f-9ef8b4d70bcf)

- 메인 페이지에서 공지사항 리스트를 볼 수 있습니다.
- 공지사항을 클릭하면, 관리자가 작성한 공지사항의 세부 정보를 확인할 수 있는 페이지로 이동합니다.

### 4. 메인 대시보드
![Uploading 메인 대쉬보드.gif…]()


- 메인 대시보드는 주간 캘린더 형식으로 표시됩니다.
- 임원들이 사용한 물품과 차량을 보여줍니다.
- 각 대여 종류의 이름과 대여 용도가 표시됩니다.
- 대여일은 노란색으로 표시됩니다.
- 반납일은 초록색으로 표시됩니다.
- 대여일과 반납일이 동일한 경우, 보라색으로 표시됩니다.








