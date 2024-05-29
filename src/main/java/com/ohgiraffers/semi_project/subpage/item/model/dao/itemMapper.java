package com.ohgiraffers.semi_project.subpage.item.model.dao;

import com.ohgiraffers.semi_project.subpage.item.model.dto.ItemDTO;
import com.ohgiraffers.semi_project.subpage.item.model.dto.ItemJoinDTO;
import com.ohgiraffers.semi_project.subpage.item.model.dto.registRentalDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface itemMapper {
    List<ItemJoinDTO> findAllItem();

    

    List<ItemJoinDTO> finditemList();

    int itemRental(Map<String, Object> itemRental);
    

    List<ItemJoinDTO> findMyItems(int userCode);

    List<ItemJoinDTO> findAllItems();

    int upMyitemlist(Map<String, Object> params); //반납 버튼

    int itemListUpdate(Map<String, Object> params); //빈닙 밭,ㄴ

    int getItemInventory(String itemName);

    int itemRentalUpdate(Map<String, Object> itemRental);
}
