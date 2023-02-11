package com.moyeohaeng.tripplannerbo.common.domain.response;

import com.moyeohaeng.tripplannerbo.common.domain.CommonDetailCode;
import lombok.Getter;

@Getter
public class CommonDetailCodeResponse {

    private long commonCdNo;
    private long commonGrpCdNo;
    private String commonCdId;
    private String commonCdNm;
    private String commonCdDesc;
    private String commonTypeCd1;
    private String commonTypeCd2;
    private String commonTypeCd3;
    private int commonSortSeq;
    private String useYn;

    public CommonDetailCodeResponse(CommonDetailCode entity) {
        this.commonCdNo = entity.getCommonCdNo();
        this.commonGrpCdNo = entity.getCommonGrpCdNo();
        this.commonCdId = entity.getCommonCdId();
        this.commonCdNm = entity.getCommonCdNm();
        this.commonCdDesc = entity.getCommonCdDesc();
        this.commonTypeCd1 = entity.getCommonTypeCd1();
        this.commonTypeCd2= entity.getCommonTypeCd2();
        this.commonTypeCd3 = entity.getCommonTypeCd3();
        this.commonSortSeq = entity.getCommonSortSeq();
        this.useYn = entity.getUseYn();
    }

}
