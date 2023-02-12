package com.moyeohaeng.tripplannerbo.common.controller;

import com.moyeohaeng.tripplannerbo.common.domain.request.CommonDetailCodeSaveRequest;
import com.moyeohaeng.tripplannerbo.common.domain.request.CommonGroupCodeSaveRequest;
import com.moyeohaeng.tripplannerbo.common.domain.response.CommonDetailCodeResponse;
import com.moyeohaeng.tripplannerbo.common.domain.response.CommonGroupCodeResponse;
import com.moyeohaeng.tripplannerbo.common.service.CommonService;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CommonApiController {

    final static Logger LOGGER = LogManager.getLogger(CommonApiController.class);
    private final CommonService commonService;

    @PostMapping("/api/v1/commGrp/commGrpCd")
    public Long save(@RequestBody CommonGroupCodeSaveRequest commonGroupCodeRequest) {
        return commonService.save(commonGroupCodeRequest);
    }

    @PostMapping("/api/v1/commDtl/commDtlCd")
    public Long save(@RequestBody CommonDetailCodeSaveRequest commonDetailCodeRequest) {
        return commonService.save(commonDetailCodeRequest);
    }

    @GetMapping("/api/v1/commGrp/all")
    public List<CommonGroupCodeResponse> findAllCommGrpCd() {
        return commonService.findAllCommonGroupCode();
    }

    @GetMapping("/api/v1/commGrp/default/{commGrpCdNo}")
    public CommonGroupCodeResponse findCommGrpByNo(@PathVariable long commGrpCdNo) {
        return commonService.findCommGrpByNo(commGrpCdNo);
    }

    @GetMapping("/api/v1/commGrp/{param}")
    public CommonGroupCodeResponse findCommGrpCdByGrpParam(@PathVariable String param
            , @RequestParam(value="srchType") String srchType) {
        if ("id".equals(srchType)) {
            return commonService.findCommGrpByCommonGrpCdId(param);
        } else if ("name".equals(srchType)) {
            return commonService.findCommGrpByCommonGrpCdNm(param);
        } else {
            LOGGER.error("[CommonApiController.findCommGrpCdByGrpParam] :: 올바르지 않은 Query parameter");
            return new CommonGroupCodeResponse(null);
        }
    }

    @GetMapping("/api/v1/commDtl/all")
    public List<CommonDetailCodeResponse> findAllCommDtlCd() {
        return commonService.findAllCommonDetailCode();
    }

    @GetMapping("/api/v1/commDtl/default/{commCdNo}")
    public CommonDetailCodeResponse findCommDtlByNo(@PathVariable long commCdNo) {
        return commonService.findCommDtlByNo(commCdNo);
    }

    @GetMapping("/api/v1/commDtl/{param}")
    public CommonDetailCodeResponse findCommDtlCdByDtlParam(@PathVariable String param
            , @RequestParam(value="srchType") String srchType) {
        if ("id".equals(srchType)) {
            return commonService.findCommDtlByCommonCdId(param);
        } else if ("name".equals(srchType)) {
            return commonService.findCommDtlByCommonCdNm(param);
        } else {
            LOGGER.error("[CommonApiController.findCommDtlCdByDtlParam] :: 올바르지 않은 Query parameter");
            return new CommonDetailCodeResponse(null);
        }
    }
}
