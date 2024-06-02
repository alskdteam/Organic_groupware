package com.ohgiraffers.semi_project.subpage.profile.model.service;

import com.ohgiraffers.semi_project.auth.model.service.Userdata;
import com.ohgiraffers.semi_project.subpage.edoc.model.dao.EdocMapper;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.UploadFileDTO;
import com.ohgiraffers.semi_project.subpage.profile.model.dao.ProfileMapper;
import com.ohgiraffers.semi_project.subpage.profile.model.dto.EmployeeDTO;
import com.ohgiraffers.semi_project.subpage.profile.model.dto.MemoDTO;
import com.ohgiraffers.semi_project.subpage.profile.model.dto.ProfileDTO;
import com.ohgiraffers.semi_project.user.model.dto.LoginUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.List;
import java.util.Map;


@Service
public class ProfileService {

    private final ProfileMapper profileMapper;


    @Autowired
    public ProfileService(ProfileMapper profileMapper) {
        this.profileMapper = profileMapper;
    }


    @Transactional
    public void registNewProfile(ProfileDTO newFile) {
        // 프로필이 존재하는지 확인
        ProfileDTO existingProfile = profileMapper.getProfileByUserNo(newFile.getUser_no());
        System.out.println("여기");
        System.out.println(existingProfile);

        if (existingProfile != null) {
            // 프로필이 존재하면 업데이트 수행
            System.out.println("프로필이 이미 있습니다.");
            profileMapper.updateProfile(newFile);
        } else {
            // 프로필이 존재하지 않으면 삽입 수행
            profileMapper.registNewProfile(newFile);
        }
    }


    public List<MemoDTO> findMemoTitle(int user_no) {

        return profileMapper.findMemoTitle(user_no);
    }

    public void registMem(MemoDTO memoDTO) {

         profileMapper.registMem(memoDTO);
    }


    public MemoDTO findMemoPage(int memo_id) {

        return profileMapper.findMemoPage(memo_id);
    }

    public int updateMemo(MemoDTO memoDTO) {
        System.out.println("memoDTO = " + memoDTO);
        return profileMapper.updateMemo(memoDTO);
    }

    public Map<String, Object> selectProfile(int user_no) {
        // 프로필 정보를 데이터베이스에서 가져오는 메소드 호출
        List<ProfileDTO> profiles = profileMapper.selectProfile(user_no);

        List<ProfileDTO> profilesWithoutImage = new ArrayList<>();
        String base64ImageData = null; // Initializing the variable to hold base64 encoded image data

        // 프로필 정보에서 프로필 이미지를 제외하고 다른 필드를 유지하여 새로운 리스트에 추가
        for (ProfileDTO profile : profiles) {
            ProfileDTO profileWithoutImage = new ProfileDTO();
            // 이미지를 제외한 다른 필드 값 설정
            profileWithoutImage.setKorea_name(profile.getKorea_name());
            profileWithoutImage.setEnglish_name(profile.getEnglish_name());
            profileWithoutImage.setPhone_number(profile.getPhone_number());
            profileWithoutImage.setEmail(profile.getEmail());

            // 새로운 리스트에 추가
            profilesWithoutImage.add(profileWithoutImage);

            // 프로필 이미지를 Base64로 인코딩
            if (profile.getProfile_image() != null) {
                byte[] imageData = profile.getProfile_image();
                // 바이트 배열을 Base64로 인코딩
                base64ImageData = Base64.getEncoder().encodeToString(imageData);
            }
        }

        // Create a map to hold the results
        Map<String, Object> result = new HashMap<>();
        result.put("profilesWithoutImage", profilesWithoutImage);
        result.put("base64ImageData", base64ImageData);

        return result;
    }

    // 도아 사원조회
    public List<EmployeeDTO> findAllEmployee() {

        return profileMapper.findAllEmployee();

    }

    // 도아 - 개별사원 조회
    public List<EmployeeDTO> findDepartment(Map<String, String> search) {

        return  profileMapper.findDepartment(search);
    }

    public List<Map<String, Object>> findcalendarList(int userNo) {

        return profileMapper.findcalendarList(userNo);
    }

    public void updateCalender(Map<String,Object> updateCalender) {

         profileMapper.updateCalender(updateCalender);
    }


    public void insetCalender(Map<String, Object> insetCalender) {

        profileMapper.insetCalender(insetCalender);
    }

}


