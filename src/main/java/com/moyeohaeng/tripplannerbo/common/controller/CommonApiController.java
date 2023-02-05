package com.moyeohaeng.tripplannerbo.common.controller;

import com.moyeohaeng.tripplannerbo.common.domain.request.CommonCodeSaveRequest;
import com.moyeohaeng.tripplannerbo.common.domain.response.CommonCodeResponse;
import com.moyeohaeng.tripplannerbo.common.service.CommonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CommonApiController {

    private final CommonService commonService;

    @PostMapping("/api/v1/commCd")
    public Long save(@RequestBody CommonCodeSaveRequest commonCodeRequest) {
        return commonService.save(commonCodeRequest);
    }

    @GetMapping("/api/v1/commCd/{commonNo}")
    public CommonCodeResponse findByNo(@PathVariable long commonNo) {
        return commonService.findByNo(commonNo);
    }

    @GetMapping("/api/v1/commCdNm/{commonCdId}")
    public CommonCodeResponse findByCommonCdId(@PathVariable String commonCdId) {
        return commonService.findCommonCodeByCommonCdId(commonCdId);
    }
}
