package com.moyeohaeng.tripplannerbo.menu.domain.response;

import com.moyeohaeng.tripplannerbo.menu.domain.Menus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class MenuResponse {

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

    public MenuResponse (final Menus menus) {
        this.menuNo = menus.getMenuNo();
        this.menuName = menus.getMenuName();
        this.menuUrl = menus.getMenuUrl();
        this.menuSeq = menus.getMenuSeq();
        this.menuParentNo = menus.getMenuParentNo();
        this.siteDiviCd = menus.getSiteDiviCd();
        this.useYn = menus.getUseYn();
        this.regId = menus.getRegId();
        this.regDtime = menus.getRegDtime();
        this.uptId = menus.getUptId();
        this.uptDtime = menus.getUptDtime();
    }
}
