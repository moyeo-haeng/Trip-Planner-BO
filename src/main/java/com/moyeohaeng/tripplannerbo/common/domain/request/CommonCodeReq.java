package com.moyeohaeng.tripplannerbo.common.domain.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class CommonCodeReq {
    @Id
    private String commonNo;
    private String commonType;
    private String commonCdId;
    private String commonCdNm;
    private String commonGroupCdId;
    private String commonGroupCdNm;
    private String commonCdEditYn;
    private String useYn;
    private String regId;
    private LocalDateTime regDtime;
    private String uptId;
    private LocalDateTime uptDtime;

    public CommonCodeReq toCommonCode() {
        return CommonCodeReq.builder()
                .commonNo(commonNo)
                .commonType(commonType)
                .commonCdId(commonCdId)
                .commonCdNm(commonCdNm)
                .commonGroupCdId(commonGroupCdId)
                .commonGroupCdNm(commonGroupCdNm)
                .commonCdEditYn(commonCdEditYn)
                .useYn(useYn)
                .regId(regId)
                .regDtime(regDtime)
                .uptId(uptId)
                .uptDtime(uptDtime)
                .build();
    }

}
