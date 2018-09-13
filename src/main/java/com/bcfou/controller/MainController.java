package com.bcfou.controller;

import com.bcfou.common.entity.VipCrackUrl;
import com.bcfou.common.service.VipUrlService;
import com.bcfou.vo.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 核心功能
 * @Author: 编程否
 * @Date: 2018/9/12 19:07
 */
@Controller
public class MainController {
    @Autowired
    private VipUrlService vipService;

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @PostMapping("/index")
    @ResponseBody
    public Video index(String url){
        List<VipCrackUrl> vipUrlList = vipService.findAll();
        //默认只有一个接口，即查询出的第一个接口
        final String BASE_API = vipUrlList.get(0).getUrl();
        Video video = new Video();
        String lastUrl = BASE_API + url;
        video.setId(lastUrl);
        return video;
    }
}
