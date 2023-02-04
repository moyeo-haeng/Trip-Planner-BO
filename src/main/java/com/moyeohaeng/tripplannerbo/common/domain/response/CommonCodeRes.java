package com.moyeohaeng.tripplannerbo.common.domain.response;

import com.moyeohaeng.tripplannerbo.common.domain.CommonCode;
import lombok.*;

import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommonCodeRes {

    private String id;  // 사용자 설정 id 요소 값
    private boolean defaultOption; // '전체' on/off
    private boolean checked; // 체크 여부
    private boolean disabled; // 수정 불가 여부
    private CommonCode commonCode;
    List<CommonCodeRes> commonCodes; // 결과 코드 값

}
