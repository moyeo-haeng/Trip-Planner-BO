package com.moyeohaeng.tripplannerbo.menu.domain.response;

import com.moyeohaeng.tripplannerbo.menu.domain.Menus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MenuResponse {

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
    private List<MenuResponse> children;

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
        this.children = menus.getChildren().stream().map(MenuResponse::new).collect(Collectors.toList());
    }
}
