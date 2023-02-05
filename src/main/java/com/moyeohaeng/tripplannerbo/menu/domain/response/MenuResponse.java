package com.moyeohaeng.tripplannerbo.menu.domain.response;

import com.moyeohaeng.tripplannerbo.menu.domain.Menu;
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
    private List<MenuResponse> children;

    public MenuResponse (final Menu menu) {
        this.menuNo = menu.getMenuNo();
        this.menuName = menu.getMenuName();
        this.menuUrl = menu.getMenuUrl();
        this.menuSeq = menu.getMenuSeq();
        this.siteDiviCd = menu.getSiteDiviCd();
        this.useYn = menu.getUseYn();
        this.regId = menu.getRegId();
        this.regDtime = menu.getRegDtime();
        this.uptId = menu.getUptId();
        this.uptDtime = menu.getUptDtime();
        this.children = menu.getChildren().stream().map(MenuResponse::new).collect(Collectors.toList());
    }
}
