package com.ohgiraffers.semi_project.subpage.account.model.dao;

import com.ohgiraffers.semi_project.subpage.account.model.dto.AccountJoinDTO;
import com.ohgiraffers.semi_project.subpage.account.model.dto.RegistAccDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface accountMapper {

    List<AccountJoinDTO> findAllAcount();

    void registAccount(RegistAccDTO registAccDTO);
}
