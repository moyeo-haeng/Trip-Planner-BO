package com.moyeohaeng.tripplannerbo.common.domain.request;

import com.moyeohaeng.tripplannerbo.common.domain.CommonDetailCode;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class CommonDetailCodeSaveRequest {

    private long commonCdNo;
    private long commonGrpCdNo;
    private String commonCdId;
    private String commonCdNm;
    private String commonCdDesc;
    private String commonTypeCd1;
    private String commonTypeCd2;
    private String commonTypeCd3;
    private int commonSortSeq;
    private String regId;
    private LocalDateTime regDtime;
    private String useYn;

    @Builder
    public CommonDetailCodeSaveRequest(long commonCdNo, long commonGrpCdNo, String commonCdId, String commonCdNm
            , String commonCdDesc, String commonTypeCd1, String commonTypeCd2, String commonTypeCd3
            , int commonSortSeq, String regId, LocalDateTime regDtime, String useYn) {
        this.commonCdNo = commonCdNo;
        this.commonGrpCdNo = commonGrpCdNo;
        this.commonCdId = commonCdId;
        this.commonCdNm = commonCdNm;
        this.commonCdDesc = commonCdDesc;
        this.commonTypeCd1 = commonTypeCd1;
        this.commonTypeCd2 = commonTypeCd2;
        this.commonTypeCd3 = commonTypeCd3;
        this.commonSortSeq = commonSortSeq;
        this.regId = regId;
        this.regDtime = regDtime;
        this.useYn = useYn;
    }

    public CommonDetailCode toEntity() {
        return CommonDetailCode.builder()
                .commonCdNo(commonCdNo)
                .commonGrpCdNo(commonGrpCdNo)
                .commonCdId(commonCdId)
                .commonCdNm(commonCdNm)
                .commonCdDesc(commonCdDesc)
                .commonTypeCd1(commonTypeCd1)
                .commonTypeCd2(commonTypeCd2)
                .commonTypeCd3(commonTypeCd3)
                .commonSortSeq(commonSortSeq)
                .regId(regId)
                .regDtime(regDtime)
                .useYn(useYn)
                .build();
    }
}
