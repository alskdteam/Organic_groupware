![화면 기록 2024-06-03 오전 12 12 14](https://github.com/alskdteam/Organic_groupware/assets/153148788/a6e38ebf-406f-42aa-a1fe-a69b6c3c763f)## 프로젝트 제목
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
Fullcalendar, Address

## 로그인 자격 증명 목록
- **관리자 계정**
  - 아이디: 2001
  - 비밀번호: [2001]

- **일반 사원용 계정**
  - 아이디: 2002
  - 비밀번호: [2002]
 
<br>

## 📌 프로젝트 및 기능 소개( gif 사용: 컨텐츠 로딩을 기다려주세요.)

### 1.로그인
![화면 기록 2024-06-02 오후 6 52 37](https://github.com/alskdteam/Organic_groupware/assets/153148788/1cd9c10c-1f2b-460e-8035-321831e1f639)

- 사용자는 지정된 번호로만 로그인할 수 있습니다. 회원가입은 관리자가 처리합니다.
- Spring Security를 사용하여 잘못된 아이디 또는 비밀번호를 입력할 경우 로그인이 거부됩니다.
- 로그인 성공시, 사용자의 프로필 정보가 사이드바에 나타납니다.
- 사용자의 권한에 따라 사이드바에 적절한 메뉴가 표시됩니다.
- Admin으로 로그인한 경우에는 관리 기능 메뉴가 추가됩니다.
- 관리 기능 버튼을 클릭하면, 관리자 전용 페이지로 이동합니다.
- 로그아웃 버튼을 클릭하면 현재 세션을 종료하여 로그아웃됩니다.
<br>


### 2. 출퇴근
![출퇴근](https://github.com/alskdteam/Organic_groupware/assets/153148788/89c2e87c-cad8-430b-97d9-1c99244bcc43)

- 유저는 사이드바에서 출퇴근 버튼을 통해 출근 및 퇴근을 기록할 수 있습니다.
- 버튼을 클릭하면, 클라이언트에서는 현재 날짜와 시간을 서버로 전송합니다.
- 서버에서는 받은 데이터를 주어진 형식에 맞게 처리하여 데이터베이스에 출근 시간 및 퇴근 시간을 저장합니다.
- 서버는 현재 날짜를 기준으로 해당 정보를 뷰포트에 다시 표시합니다.
<br>


### 3. 공지사항
![화면 기록 2024-06-02 오후 11 20 38](https://github.com/alskdteam/Organic_groupware/assets/153148788/a6a29b8d-9d0c-476d-9a9c-9c3447356998)


- 메인 페이지에서 공지사항 리스트를 볼 수 있습니다.
- 공지사항을 클릭하면, 관리자가 작성한 공지사항의 세부 정보를 확인할 수 있는 페이지로 이동합니다.
<br>

### 4. 메인 대시보드
![메인 대쉬보드](https://github.com/alskdteam/Organic_groupware/assets/153148788/3942a6fe-5eaf-4cee-81dd-a3cfa51ebadb)

- 메인 대시보드는 주간 캘린더 형식으로 표시됩니다.
- 임원들이 사용한 물품과 차량을 보여줍니다.
- 각 대여 종류의 이름과 대여 용도가 표시됩니다.
- 대여일은 노란색으로 표시됩니다.
- 반납일은 초록색으로 표시됩니다.
- 대여일과 반납일이 동일한 경우, 보라색으로 표시됩니다.
<br>

### 5. 전자결재
#### 5-1 전자결재 리스트
![전자문서리스트](https://github.com/alskdteam/Organic_groupware/assets/153148788/3d759113-54e6-4c6d-b0ab-4f08f7f0c5a9)


- 전자결재 리스트 페이지에서 전체, 진행중, 반려, 내결재함 버튼을 각각 눌러 조회할 수 있습니다.
- 상세 보기 버튼을 눌러 전자문서의 내용을 확인할 수 있습니

#### 5-2 전자문서 작성
![전자문서 작성(1)](https://github.com/alskdteam/Organic_groupware/assets/153148788/f20664b3-f0bc-4124-8c9f-c54b5ed617c8)

- 문서양식 페이지에서 원하는 문서(휴가, 기안서, 시말서, 회의록)를 선택할 수 있습니다.
- 선택한 문서의 양식에 따라 문서작성 페이지로 이동합니다.
- 문서작성 페이지에서 선택한 문서의 양식에 따라 필요한 정보를 입력하고 문서를 작성합니다.
- 입력 형식이 맞지 않으면 알림창을 통해 사용자에게 형식 오류를 알립니다.
- 작성한 문서에 필요한 서명을 등록한 후에는 작성이 완료됩니다.

<br>

### 6. 거래처관리
![화면 기록 2024-06-02 오후 11 25 36](https://github.com/alskdteam/Organic_groupware/assets/153148788/b882f034-90db-4a3a-bbf8-a13f9f4cb10c)

- 거래처 관리 페이지에서는 “거래처 등록” 버튼을 클릭하여 모달 창을 엽니다.
- 모달 창에서는 거래처에 대한 정보와 거래처 주소를 기입합니다.
- 거래처 주소는 우편번호 API를 활용합니다.
- 거래처 등록이 완료되면 거래처 관리 페이지에서 추가된 정보를 확인할 수 있습니다.

<br>

### 7.물품관리
![화면 기록 2024-06-02 오후 11 34 45](https://github.com/alskdteam/Organic_groupware/assets/153148788/0056003a-2278-4d1e-a227-e903c9784b0f)

- 물품 재고를 그래프로 확인합니다.
- "물품 대여" 버튼을 클릭하여 모달 창이 열립니다.
- 모달에서 원하는 물품을 선택합니다.
- 대여 가능 수량보다 많은 경우 경고 메시지가 표시됩니다.
- 대여한 물품은 "내 예약"에서 확인할 수 있습니다.
- 반납 버튼을 통해 반납할 수 있습니다.

<br>


 ### 8. 차량관리
 ![ 화면 기록 2024-06-02 오후 11 34 45](https://github.com/alskdteam/Organic_groupware/assets/153148788/9ae920a6-52fe-49c6-b015-ba6ecf697a81)

 - 차량 리스트의 대여 현황에서 대여 가능한 차량 확인할 수 있습니다.
 - "차량 예약" 버튼을 클릭하면 모달 창이 열립니다.
 - 이 모달 창에서 대여를 진행할 수 있습니다.
 - 차량을 대여한 후에는 대여 현황에서 이를 확인할 수 있고,
 - "내 예약"에서 반납 기능을 통해 반납할 수 있습니다.
 <br>

### 9. 프로필
![화면 기록 2024-06-02 오후 11 58 08](https://github.com/alskdteam/Organic_groupware/assets/153148788/25d00b37-77f8-406f-a723-221ad06035a1)

- "프로필 편집" 버튼을 눌러 모달 창을 열어 프로필 정보를 추가하거나 변경할 수 있습니다.
- 또한 "변경" 버튼을 눌러 프로필 이미지를 추가하여 저장하면, 프로필 정보가 업데이트된 것을 확인할 수 있습니다.
<br>

### 10. 캘린더
![화면 기록 2024-06-03 오전 1 49 55(1)](https://github.com/alskdteam/Organic_groupware/assets/153148788/edd9f156-d8c5-4d93-8146-3bbfdc063006)


- FullCalendar를 사용하여 일정을 종합적으로 표시하여 사용자가 한눈에 일정을 볼 수 있도록 합니다.
- "일정 추가" 버튼을 클릭하면 모달 창이 열리며, 여기서 사용자가 새 이벤트의 세부 정보를 입력할 수 있습니다. 제출하면 일정이 캘린더에 추가됩니다.
- 사용자가 캘린더에 표시된 기존 이벤트를 클릭하여 수정 인터페이스에 액세스할 수 있도록 합니다. 여기에서 이벤트의 세부 정보를 편집할 수 있습니다.

<br>

### 11. 메모
![화면 기록 2024-06-03 오전 12 12 14](https://github.com/alskdteam/Organic_groupware/assets/153148788/276a5c52-81bb-45f8-af61-80bec1a2a7ec)
- 메모 영역에 작성한 메모의 제목이 추가됩니다.
- 제목 리스트를 클릭하면 해당 메모의 내용을 볼 수 있습니다.
- 메모의 내용을 수정 할 수 있습니다.
<br>


### 12. 사원조회
![화면 기록 2024-06-03 오전 12 18 20](https://github.com/alskdteam/Organic_groupware/assets/153148788/1601fb2c-0653-4a77-8f34-4578c130ea5d)

- 사원 조회 리스트를 통해 전체 사원 정보를 볼 수 있습니다.
- 부서, 직급, 이름을 통해 사원을 검색하는 기능을 추가했습니다.
<br>


### 13. 관리기능- 공지사항
![화면 기록 2024-06-03 오전 12 28 48](https://github.com/alskdteam/Organic_groupware/assets/153148788/25f61111-8b81-4230-afc2-2f4a025cc4b3)

- 관리자는 추가 버튼을 클릭하여 새로운 공지사항을 작성할 수 있습니다.
- 작성 페이지에서 제목, 날짜, 내용 등을 입력할 수 있습니다.
- 또한, 기존 공지사항을 수정하는 것도 가능합니다.
<br>

### 14. 관리기능- 사원조회 (추가,수정,삭제)
#### 14-1 사원등록
![화면 기록 2024-06-03 오전 12 43 32(1)](https://github.com/alskdteam/Organic_groupware/assets/153148788/7e76c9d3-115d-4d9a-a3f2-2cbed67338ff)

- 이 시스템은 프로필 페이지의 사원 조회 기능을 중심으로 합니다.
- 사용자는 사원 추가 버튼을 클릭하여 사원 등록 페이지로 이동할 수 있습니다.
- 등록 페이지에서는 생년월일, 휴대전화번호, 이메일 등의 형식이 올바르게 입력되어야만 사원추가 버튼을 누를 수 있습니다.
- 버튼을 누르면 회원가입이 완료되었다는 알림창이 표시되며, 정상적으로 가입되었는지 확인할 수 있습니다.



#### 14-2 사원 수정,삭제
![화면 기록 2024-06-03 오전 12 50 04](https://github.com/alskdteam/Organic_groupware/assets/153148788/10503c03-b526-4ed6-85dd-0f4fb8b30374)


- 또한, 사원 리스트에서는 상세 정보를 확인하여 정보를 수정하거나 삭제할 수 있습니다.
<br>

### 15. 관리기능- 전자결재
![화면 기록 2024-06-03 오전 12 58 34](https://github.com/alskdteam/Organic_groupware/assets/153148788/34526d68-c7f5-446d-9edd-3b3fa97078a6)


- 일반 사원이 작성한 전자 문서를 "전체", "진행중", "반려" 버튼에 따라 리스트를 볼 수 있습니다.
- 관리자는 상세 버튼을 클릭하여 해당 문서를 열고 비고와 관리자 사인들을 등록하여 반려 또는 승인 처리를 할 수 있습니다.





