package com.moyeohaeng.tripplannerbo.common.domain.request;

import com.moyeohaeng.tripplannerbo.common.domain.CommonGroupCode;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class CommonGroupCodeSaveRequest {

    private long commonGrpCdNo;
    private String commonType;
    private String commonGrpCdId;
    private String commonGrpCdNm;
    private String commonGrpCdDesc;
    private int commonSortSeq;
    private String regId;
    private LocalDateTime regDtime;
    private String useYn;

    @Builder
    public CommonGroupCodeSaveRequest(long commonGrpCdNo, String commonType, String commonGrpCdId, String commonGrpCdNm
            , String commonGrpCdDesc, int commonSortSeq, String regId, LocalDateTime regDtime, String useYn) {
        this.commonGrpCdNo = commonGrpCdNo;
        this.commonType = commonType;
        this.commonGrpCdId = commonGrpCdId;
        this.commonGrpCdNm = commonGrpCdNm;
        this.commonGrpCdDesc = commonGrpCdDesc;
        this.commonSortSeq = commonSortSeq;
        this.regId = regId;
        this.regDtime = regDtime;
        this.useYn = useYn;
    }

    public CommonGroupCode toEntity() {
        return CommonGroupCode.builder()
                .commonGrpCdNo(commonGrpCdNo)
                .commonType(commonType)
                .commonGrpCdId(commonGrpCdId)
                .commonGrpCdNm(commonGrpCdNm)
                .commonGrpCdDesc(commonGrpCdDesc)
                .commonSortSeq(commonSortSeq)
                .regId(regId)
                .regDtime(regDtime)
                .useYn(useYn)
                .build();
    }
}
