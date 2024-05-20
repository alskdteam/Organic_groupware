package com.ohgiraffers.semi_project.subpage.item.model.service;

import com.ohgiraffers.semi_project.subpage.item.model.dao.itemMapper;
import com.ohgiraffers.semi_project.subpage.item.model.dto.ItemDTO;
import com.ohgiraffers.semi_project.subpage.item.model.dto.ItemJoinDTO;
import com.ohgiraffers.semi_project.subpage.item.model.dto.registRentalDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {


    private final itemMapper itemMapper;

    @Autowired
    public ItemService(itemMapper itemMapper){ this.itemMapper = itemMapper;}

    public List<ItemJoinDTO> findAllItem() {

        return itemMapper.findAllItem();
    }

    public void registitem(registRentalDTO rentalDTO) {itemMapper.registitem(rentalDTO);
    }

    public List<ItemDTO> finditemList() {

        return itemMapper.finditemList();
    }
}
