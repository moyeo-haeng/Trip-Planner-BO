package com.moyeohaeng.tripplannerbo.common.util;

import com.moyeohaeng.tripplannerbo.common.domain.request.CommonCodeBoxReq;
import com.moyeohaeng.tripplannerbo.common.domain.response.CommonCodeBoxRes;
import com.moyeohaeng.tripplannerbo.common.utility.CommonUtility;
import org.springframework.stereotype.Component;

@Component
public class CommonUtil extends CommonUtility {
    /**
     * 공통코드 생성
     */
    public CommonCodeBoxRes createElement(CommonCodeBoxReq parameter) {

        return CommonCodeBoxRes.builder()
                .id(parameter.getId())
                .defaultText(parameter.getDefaultText())
                .defaultOption(parameter.isDefaultOption())
                .disabled(parameter.isDisabled())
                .checked(parameter.isChecked())
                .commonCodes(searchCommonCode(parameter.toCommonCode()))
                .build();
    }
}
