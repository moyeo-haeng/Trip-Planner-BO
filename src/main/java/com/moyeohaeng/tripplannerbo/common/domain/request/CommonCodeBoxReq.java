package com.moyeohaeng.tripplannerbo.common.domain.request;

import com.moyeohaeng.tripplannerbo.common.domain.CommonCode;
import com.moyeohaeng.tripplannerbo.common.domain.CommonDetailCode;
import lombok.*;

import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommonCodeBoxReq {
    private String commonCdId;
    private String commonGrpCdId;
    private String commonTypeCd1;
    private String commonTypeCd2;
    private String commonTypeCd3;

    private String id;  // 사용자 설정 id 요소 값

    @Builder.Default private String defaultText = "전체";
    @Builder.Default private boolean defaultOption = true; // '전체' on/off
    @Builder.Default private boolean checked = false; // 체크 여부
    @Builder.Default private boolean disabled = false; // 수정 불가 여부

/*    public CommonDetailCode toCommonCode() {

        return CommonDetailCode.builder()
                .commonCdNo(commonCdNo)
                .commonGrpCdNo(commonGrpCdNo)
                .commonCdId(commonCdId)
                .commonCdNm(commonCdNm)
                .commonCdDesc(commonCdDesc)
                .commonSortSeq(commonSortSeq)
                .useYn(useYn)
                .build();
    }*/

}
