package com.moyeohaeng.tripplannerbo.common.util;

import com.moyeohaeng.tripplannerbo.common.domain.CommonCode;
import com.moyeohaeng.tripplannerbo.common.domain.request.CommonCodeReq;
import com.moyeohaeng.tripplannerbo.common.domain.response.CommonCodeRes;
import com.moyeohaeng.tripplannerbo.common.utility.CommonUtility;
import org.springframework.stereotype.Component;

@Component
public class CommonUtil extends CommonUtility {
    /**
     * 공통코드 생성
     */
    public CommonCodeRes createElement(CommonCodeReq parameter) {

        return CommonCodeRes.builder()
                .id(parameter.getId())
                .defaultOption(parameter.isDefaultOption())
                .disabled(parameter.isDisabled())
                .checked(parameter.isChecked())
                .commonCodes(searchCommonCode(parameter.toCommonCode()))
                .build();
    }
}
