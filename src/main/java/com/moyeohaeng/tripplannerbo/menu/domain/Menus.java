package com.moyeohaeng.tripplannerbo.menu.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Menus {

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
}