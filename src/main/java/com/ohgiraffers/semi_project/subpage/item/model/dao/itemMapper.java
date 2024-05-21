package com.ohgiraffers.semi_project.subpage.item.model.dao;

import com.ohgiraffers.semi_project.subpage.item.model.dto.ItemDTO;
import com.ohgiraffers.semi_project.subpage.item.model.dto.ItemJoinDTO;
import com.ohgiraffers.semi_project.subpage.item.model.dto.registRentalDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface itemMapper {
    List<ItemJoinDTO> findAllItem();

    void registitem(registRentalDTO rentalDTO);

    List<ItemJoinDTO> finditemList();
}
