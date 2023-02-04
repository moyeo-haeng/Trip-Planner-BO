package com.moyeohaeng.tripplannerbo.common.domain.request;

import com.moyeohaeng.tripplannerbo.common.domain.CommonCode;
import lombok.*;

import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommonCodeReq {
    @Id
    private int commonNo;
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
    private String uptId;
    private LocalDateTime uptDtime;

    private String id;  // 사용자 설정 id 요소 값
    private String defaultOption;  // '전체' on/off

    public CommonCode toCommonCode() {

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
                .uptId(uptId)
                .uptDtime(uptDtime)
                .build();
    }

}
