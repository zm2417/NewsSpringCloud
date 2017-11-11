package com.zm.servicecontent.service;

import com.zm.servicecontent.bean.Tags;
import com.zm.servicecontent.dao.TagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {
    @Autowired(required = false)
    private TagMapper tagMapper;

    /*
    获取某一个newId的所以tag；
     */
    public List<Tags> getTags(int newId){
        return tagMapper.getTags(newId);
    }
}
