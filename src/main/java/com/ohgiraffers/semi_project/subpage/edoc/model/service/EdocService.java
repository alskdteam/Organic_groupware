package com.ohgiraffers.semi_project.subpage.edoc.model.service;

import com.ohgiraffers.semi_project.subpage.edoc.model.dao.EdocMapper;
import com.ohgiraffers.semi_project.subpage.edoc.model.dto.EdocAndEmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdocService {

    private final EdocMapper edocMapper;

    @Autowired
    public EdocService(EdocMapper edocMapper) {
        this.edocMapper = edocMapper;
    }

    public List<EdocAndEmployeeDTO> findAllEmployeeAndEdoc() {

        return edocMapper.findAllEmployeeAndEdocList();
    }
}
