package com.moyeohaeng.tripplannerbo.common.utility;

import com.moyeohaeng.tripplannerbo.common.domain.CommonCode;
import com.moyeohaeng.tripplannerbo.common.domain.request.CommonCodeReq;
import com.moyeohaeng.tripplannerbo.common.domain.response.CommonCodeRes;
import com.moyeohaeng.tripplannerbo.common.repository.CommonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommonUtility {

    @Autowired
    private CommonRepository commonRepository;

    public final List<CommonCodeRes> searchCommonCode(CommonCodeReq parameter) {
        return commonRepository.searchCommonCode(parameter);
    }
}
