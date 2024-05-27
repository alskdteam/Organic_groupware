package com.ohgiraffers.semi_project.subpage.item.model.service;

import com.ohgiraffers.semi_project.subpage.item.model.dao.itemMapper;
import com.ohgiraffers.semi_project.subpage.item.model.dto.ItemDTO;
import com.ohgiraffers.semi_project.subpage.item.model.dto.ItemJoinDTO;
import com.ohgiraffers.semi_project.subpage.item.model.dto.registRentalDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ItemService {


    private final itemMapper itemMapper;

    @Autowired
    public ItemService(itemMapper itemMapper){ this.itemMapper = itemMapper;}

    public List<ItemJoinDTO> findAllItem() {

        return itemMapper.findAllItem();
    }



    public List<ItemJoinDTO> finditemList() {

        return itemMapper.finditemList();
    }

    public int itemRental(Map<String ,Object>itemRental) {

        return itemMapper.itemRental(itemRental);
    }

    public List<ItemJoinDTO> findMyItems(int userCode) {
        return itemMapper.findMyItems(userCode);
    }

    public List<ItemJoinDTO> findAllItems() {
        return itemMapper.findAllItems();
    }

    public int upMyitemlist(Map<String, Object> params) {
        return  itemMapper.upMyitemlist(params);
    }

    public int itemListUpdate(Map<String, Object> params) {
        return itemMapper.itemListUpdate(params);
    }
}
