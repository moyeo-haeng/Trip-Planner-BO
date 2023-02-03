package com.moyeohaeng.tripplannerbo.common.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class CommonCode {
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

}
