package com.moyeohaeng.tripplannerbo.common.domain.response;

import com.moyeohaeng.tripplannerbo.common.domain.CommonCode;
import lombok.Getter;

@Getter
public class CommonCodeResponse {

    private long commonNo;
    private String commonType;
    private String commonCdId;
    private String commonCdNm;
    private String commonCdDesc;
    private String commonGroupCdId; //임시
    private String commonGroupCdNm; //임시
    private String commonGroupCdDesc; //임시
    private int commonSortSeq;
    private String commonCdEditYn;
    private String useYn;

    public CommonCodeResponse(CommonCode entity) {
        this.commonNo = entity.getCommonNo();
        this.commonType = entity.getCommonType();
        this.commonCdId = entity.getCommonCdId();
        this.commonCdNm = entity.getCommonCdNm();
        this.commonCdDesc = entity.getCommonCdDesc();
        this.commonGroupCdId = entity.getCommonGroupCdId();
        this.commonGroupCdNm = entity.getCommonGroupCdNm();
        this.commonGroupCdDesc = entity.getCommonGroupCdDesc();
        this.commonSortSeq = entity.getCommonSortSeq();
        this.commonCdEditYn = entity.getCommonCdEditYn();
        this.useYn = entity.getUseYn();
    }
}
