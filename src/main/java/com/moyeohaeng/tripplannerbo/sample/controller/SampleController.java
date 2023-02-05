package com.moyeohaeng.tripplannerbo.sample.controller;

import com.moyeohaeng.tripplannerbo.common.util.CommonUtil;
import com.moyeohaeng.tripplannerbo.common.utility.CommonUtility;
import com.moyeohaeng.tripplannerbo.sample.domain.SampleModel;
import com.moyeohaeng.tripplannerbo.sample.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class SampleController extends CommonUtility {

    private final SampleService sampleService;
    @GetMapping("sample")
    public String Sample(){

//        test();

//        List<SampleModel> sampleModelList = sampleService.sample();

        return "/sample/sample";
    }

}
