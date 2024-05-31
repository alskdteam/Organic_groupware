package com.ohgiraffers.semi_project.subpage.main.model.dao;

import com.ohgiraffers.semi_project.subpage.main.model.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@Mapper
public interface MainMapper {


    List<NoticeDTO> selectNoticeList();


    List<SidebarImageDTO> selectSidebar(int user_no);

//조회
    CommuteDTO selectCommuteTime(CommuteDTO commuteDTO);

//    출근 추가
    void uploadStartTime(CommuteDTO commuteDTO);

//    퇴근 업데이트
    void updateEndTime(CommuteDTO commuteDTO);


    List<CarDTO> selectDashboard(CarDTO carDTO);

    List<RentalDTO> selectRental(RentalDTO rentalDTO);

    int noticeMain(NoticeDTO noticeDTO);

    NoticeDTO findNotice(int noticeId);


    List<NoticeDTO> findAllNotice();
}
