package com.moyeohaeng.tripplannerbo.menu.domain;

import com.moyeohaeng.tripplannerbo.menu.domain.request.MenuRequest;
import com.moyeohaeng.tripplannerbo.menu.domain.response.MenuResponse;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name="menu")
public class Menus {

    @Id @GeneratedValue
    @Column(name = "menu_no")
    private String menuNo;
    @Column(name = "menu_name")
    private String menuName;
    @Column(name = "menu_url")
    private String menuUrl;
    @Column(name = "menu_seq")
    private int menuSeq;
    @Column(name = "site_divi_cd")
    private String siteDiviCd;
    @Column(name = "use_yn")
    private String useYn;
    @Column(name = "reg_id")
    private String regId;
    @Column(name = "reg_dtime")
    private LocalDateTime regDtime;
    @Column(name = "upt_id")
    private String uptId;
    @Column(name = "upt_dtime")
    private LocalDateTime uptDtime;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_parent_no")
    private Menus parent;
    @OneToMany(mappedBy = "parent")
    private List<Menus> children = new ArrayList<>();

    public Menus (final MenuRequest menuRequest) {
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