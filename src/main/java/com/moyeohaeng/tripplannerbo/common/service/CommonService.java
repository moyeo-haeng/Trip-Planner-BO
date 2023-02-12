package com.moyeohaeng.tripplannerbo.common.service;

import com.moyeohaeng.tripplannerbo.common.domain.request.CommonDetailCodeSaveRequest;
import com.moyeohaeng.tripplannerbo.common.domain.request.CommonGroupCodeSaveRequest;
import com.moyeohaeng.tripplannerbo.common.domain.response.CommonDetailCodeResponse;
import com.moyeohaeng.tripplannerbo.common.domain.response.CommonGroupCodeResponse;

import java.util.List;

public interface CommonService {

    public Long save(CommonDetailCodeSaveRequest commonDetailCodeSaveRequest);
    public Long save(CommonGroupCodeSaveRequest commonGroupCodeSaveRequest);

    public List<CommonGroupCodeResponse> findAllCommonGroupCode();
    public List<CommonDetailCodeResponse> findAllCommonDetailCode();
    public CommonGroupCodeResponse findCommGrpByNo(long commonGrpCdNo);
    public CommonDetailCodeResponse findCommDtlByNo(long commonCdNo);
    public CommonGroupCodeResponse findCommGrpByCommonGrpCdId (String commonGrpCdId);
    public CommonGroupCodeResponse findCommGrpByCommonGrpCdNm (String commonGrpCdNm);
    public CommonDetailCodeResponse findCommDtlByCommonCdId (String commonCdId);
    public CommonDetailCodeResponse findCommDtlByCommonCdNm (String commonCdNm);
    //    public List<CommonCodeResponse> findAllCode();
//    public CommonCodeResponse findCommonCodeByCommonCdId(String commonCdId);
}
