package com.zm.servicecontent.web;

import com.zm.servicecontent.bean.Content;
import com.zm.servicecontent.bean.RelateNews;
import com.zm.servicecontent.bean.Tags;
import com.zm.servicecontent.service.ContentService;
import com.zm.servicecontent.service.RelateNewsService;
import com.zm.servicecontent.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/")
public class ContentController {
    @Autowired
    private ContentService contentService;
    @Autowired
    private TagService tagService;
    @Autowired
    private RelateNewsService relateNewsService;

    @PostMapping(value = "/updateUpNews",consumes = "application/json")
    public int updateUpNews(/*@RequestParam(value = "contentId",required = true) Integer contentId,*/
                            /*@RequestParam(value = "userId",required = true) Integer userId,*/
                            /*@RequestParam(value = "type",required = true) int type*/
                            @RequestBody Map<String,String> map){
        //System.out.println(map.get("userId"));
        int contentId = Integer.parseInt(map.get("userId"));
        int userId = Integer.parseInt(map.get("userId"));
        String type = map.get("type");
        if(contentService.findUpNews(contentId,userId) != null){
            return contentService.updateUpNews(contentId,userId,type);
        }else {
            return contentService.insertUpNews(contentId,userId,type);
        }
        //return 1;
    }

    @GetMapping("/getTags/{newId}")
    public List<Tags> getTags(@PathVariable int newId){
       return  tagService.getTags(newId);
    }

    @GetMapping("/getRelateNews/{newsId}")
    public List<RelateNews> getRelateNews(@PathVariable(value = "newsId") int newsId){
        return relateNewsService.getRelateNews(newsId);
    }

    @GetMapping("/{id}/{userId}")
    public Content getTextContent(@PathVariable String id,@PathVariable String userId) {
        /*
        无登录用户查看内容页
         */
        /*if(userId == "-1"){
            return contentService.findTextById(Integer.parseInt(id));
        }*/
        String type = contentService.findUpNews(Integer.parseInt(id), Integer.parseInt(userId));
        Content content = contentService.findTextById(Integer.parseInt(id));
        content.setUpNewsType(type);
        return content;
    }


}
