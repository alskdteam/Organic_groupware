package com.ohgiraffers.semi_project.subpage.account.model.service;

import com.ohgiraffers.semi_project.subpage.account.model.dao.accountMapper;
import com.ohgiraffers.semi_project.subpage.account.model.dto.AccountJoinDTO;
import com.ohgiraffers.semi_project.subpage.account.model.dto.RegistAccDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {


    private final accountMapper accountMapper;

    @Autowired
    public AccountService(accountMapper accountMapper){this.accountMapper = accountMapper;}

    public void registAccount(RegistAccDTO registAccDTO) {
        accountMapper.registAccount(registAccDTO);
    }

    public  List<AccountJoinDTO> findAllAcount() {


       return accountMapper.findAllAcount();
    }
}
