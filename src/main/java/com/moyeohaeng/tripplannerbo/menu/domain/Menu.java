package com.moyeohaeng.tripplannerbo.menu.domain;

import com.moyeohaeng.tripplannerbo.menu.domain.request.MenuRequest;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Menu {

    @Id
    private String menuNo;

    private String menuName;

    private String menuUrl;

    private int menuSeq;

    private String siteDiviCd;

    private String useYn;

    private String regId;

    private LocalDateTime regDtime;

    private String uptId;

    private LocalDateTime uptDtime;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_parent_no")
    private Menu parent;
    
    @OneToMany(mappedBy = "parent")
    private List<Menu> children = new ArrayList<>();

    public void addChildrenMenu(Menu addChildren) {
        this.children.add(addChildren);
        addChildren.setParent(this);
    }

    public Menu (final MenuRequest menuRequest) {
        this.menuNo = menuRequest.getMenuNo();
        this.menuName = menuRequest.getMenuName();
        this.menuUrl = menuRequest.getMenuUrl();
        this.menuSeq = menuRequest.getMenuSeq();
        this.siteDiviCd = menuRequest.getSiteDiviCd();
        this.useYn = menuRequest.getUseYn();
        this.regId = menuRequest.getRegId();
        this.regDtime = menuRequest.getRegDtime();
        this.uptId = menuRequest.getUptId();
        this.uptDtime = menuRequest.getUptDtime();
    }
}