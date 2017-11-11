package com.zm.servicecontent.service;

import com.zm.servicecontent.bean.RelateNews;
import com.zm.servicecontent.dao.RelateNewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelateNewsService {
    @Autowired(required = false)
    private RelateNewsMapper relateNewsMapper;

    public List<RelateNews> getRelateNews(int newsId){
        return relateNewsMapper.getRelateNews(newsId);
    }
}
