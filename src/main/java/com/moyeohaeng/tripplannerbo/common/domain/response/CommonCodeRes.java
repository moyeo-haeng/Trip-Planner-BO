package com.moyeohaeng.tripplannerbo.common.domain.response;

import com.moyeohaeng.tripplannerbo.common.domain.CommonCode;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
public class CommonCodeRes {
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
    private CommonCode commonCode;
    List<CommonCodeRes> commonCodes; // 결과 코드 값

}
