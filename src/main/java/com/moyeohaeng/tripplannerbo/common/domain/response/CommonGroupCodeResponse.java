package com.moyeohaeng.tripplannerbo.common.domain.response;

import com.moyeohaeng.tripplannerbo.common.domain.CommonGroupCode;
import lombok.Getter;

@Getter
public class CommonGroupCodeResponse {

    private long commonGrpCdNo;
    private String commonType;
    private String commonGrpCdId;
    private String commonGrpCdNm;
    private String commonGrpCdDesc;
    private int commonSortSeq;
    private String useYn;

    public CommonGroupCodeResponse(CommonGroupCode entity) {
        this. commonGrpCdNo = entity.getCommonGrpCdNo();
        this.commonType = entity.getCommonType();
        this.commonGrpCdId = entity.getCommonGrpCdId();
        this.commonGrpCdNm = entity.getCommonGrpCdNm();
        this.commonGrpCdDesc = entity.getCommonGrpCdDesc();
        this.commonSortSeq = entity.getCommonSortSeq();
        this.useYn = entity.getUseYn();
    }
}
