package com.moyeohaeng.tripplannerbo.common.domain.response;

import com.moyeohaeng.tripplannerbo.common.domain.CommonCode;
import com.moyeohaeng.tripplannerbo.common.domain.CommonDetailCode;
import com.moyeohaeng.tripplannerbo.common.domain.CommonGroupCode;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommonCodeBoxRes {

    private String id;  // 사용자 설정 id 요소 값
    private String defaultText;
    private boolean defaultOption; // '전체' on/off
    private boolean checked; // 체크 여부
    private boolean disabled; // 수정 불가 여부
    private CommonDetailCode commonDetailCode;
    private CommonGroupCode commonGroupCode;
    List<CommonCodeBoxRes> commonCodes; // 결과 코드 값

}
