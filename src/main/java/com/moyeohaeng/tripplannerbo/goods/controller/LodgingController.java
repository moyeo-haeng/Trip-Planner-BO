package com.moyeohaeng.tripplannerbo.goods.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/goods")
@Controller
public class LodgingController {

    @GetMapping("/lodgingMgmt")
    public String lodgingMgmt(){
        return "goods/lodging_mgmt";
    }

    // 등록/상세페이지
    @GetMapping("/lodgingRegist")
    public String lodgingRegist(){
        return "goods/lodging_regist";
    }

}

