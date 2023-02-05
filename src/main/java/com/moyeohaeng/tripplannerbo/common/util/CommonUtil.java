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

        // Req, Res 지금 방식대로 하는게 맞을까...?
        // 테스트는 sample 페이지에서 하고있어!

        return CommonCodeRes.builder()
                .id(parameter.getId())
                .defaultText(parameter.getDefaultText())
                .defaultOption(parameter.isDefaultOption())
                .disabled(parameter.isDisabled())
                .checked(parameter.isChecked())
                .commonCodes(searchCommonCode(parameter.toCommonCode()))
                .build();
    }
}
