package com.moyeohaeng.tripplannerbo.common.service;

import com.moyeohaeng.tripplannerbo.common.domain.request.CommonCodeSaveRequest;
import com.moyeohaeng.tripplannerbo.common.domain.response.CommonCodeResponse;

public interface CommonService {

    public Long save(CommonCodeSaveRequest commonCodeRequest);

    public CommonCodeResponse findByNo(long commonNo);

    //    public List<CommonCodeResponse> findAllCode();
    public CommonCodeResponse findCommonCodeByCommonCdId(String commonCdId);
}
