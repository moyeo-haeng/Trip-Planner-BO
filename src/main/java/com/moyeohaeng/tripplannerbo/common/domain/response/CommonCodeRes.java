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

    private String id;
    private String defaultOption;
    private CommonCode commonCode;
    List<CommonCodeRes> commonCodes; // 결과 코드 값

}
