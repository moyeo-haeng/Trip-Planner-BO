package com.moyeohaeng.tripplannerbo.common.domain.request;

import com.moyeohaeng.tripplannerbo.common.domain.CommonCode;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class CommonCodeSaveRequest {

    private long commonNo;
    private String commonType;
    private String commonCdId;
    private String commonCdNm;
    private String commonCdDesc;
    private String commonGroupCdId;
    private String commonGroupCdNm;
    private String commonGroupCdDesc;
    private int commonSortSeq;
    private String commonCdEditYn;
    private String useYn;
    private String regId;
    private LocalDateTime regDtime;

    @Builder
    public CommonCodeSaveRequest(long commonNo, String commonType, String commonCdId, String commonCdNm, String commonCdDesc,
                                 String commonGroupCdId, String commonGroupCdNm, String commonGroupCdDesc,
                                 int commonSortSeq, String commonCdEditYn, String useYn, String regId, LocalDateTime regDtime) {
        this.commonNo = commonNo;
        this.commonType = commonType;
        this.commonCdId = commonCdId;
        this.commonCdNm = commonCdNm;
        this.commonCdDesc = commonCdDesc;
        this.commonGroupCdId = commonGroupCdId;
        this.commonGroupCdNm = commonGroupCdNm;
        this.commonGroupCdDesc = commonGroupCdDesc;
        this.commonSortSeq = commonSortSeq;
        this.commonCdEditYn = commonCdEditYn;
        this.useYn = useYn;
        this.regId = regId;
        this.regDtime = regDtime;
    }

    public CommonCode toEntity() {
        return CommonCode.builder()
                .commonNo(commonNo)
                .commonType(commonType)
                .commonCdId(commonCdId)
                .commonCdNm(commonCdNm)
                .commonCdDesc(commonCdDesc)
                .commonGroupCdId(commonGroupCdId)
                .commonGroupCdNm(commonGroupCdNm)
                .commonGroupCdDesc(commonGroupCdDesc)
                .commonSortSeq(commonSortSeq)
                .commonCdEditYn(commonCdEditYn)
                .useYn(useYn)
                .regId(regId)
                .regDtime(regDtime)
                .build();
    }
}
