package com.moyeohaeng.tripplannerbo.menu.domain.request;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class MenuRequest {

    private Long menuNo;
    private String menuName;
    private String menuUrl;
    private int menuSeq;
    private String menuParentNo;
    private String siteDiviCd;
    private String useYn;
    private String regId;
    private LocalDateTime regDtime;
    private String uptId;
    private LocalDateTime uptDtime;

    @Builder
    public MenuRequest (Long menuNo, String menuName, String menuUrl, int menuSeq, String menuParentNo, String siteDiviCd, String useYn, String regId, LocalDateTime regDtime, String uptId, LocalDateTime uptDtime) {
        this.menuNo = menuNo;
        this.menuName = menuName;
        this.menuUrl = menuUrl;
        this.menuSeq = menuSeq;
        this.menuParentNo = menuParentNo;
        this.siteDiviCd = siteDiviCd;
        this.useYn = useYn;
        this.regId = regId;
        this.regDtime = regDtime;
        this.uptId = uptId;
        this.uptDtime = uptDtime;
    }
}
