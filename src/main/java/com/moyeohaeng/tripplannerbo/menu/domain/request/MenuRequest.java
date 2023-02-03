package com.moyeohaeng.tripplannerbo.menu.domain.request;

import com.moyeohaeng.tripplannerbo.common.domain.request.CommonCodeReq;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class MenuRequest {

    @Id
    private String menuNo;
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
    public MenuRequest (String menuNo, String menuName, String menuUrl, int menuSeq, String menuParentNo, String siteDiviCd, String useYn, String regId, LocalDateTime regDtime, String uptId, LocalDateTime uptDtime) {
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
