package com.moyeohaeng.tripplannerbo.common.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@DynamicInsert
@DynamicUpdate
@Entity
public class CommonCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long commonNo;

    @NotNull
    private String commonType;

    @NotNull
    @Column(unique = true)
    private String commonCdId;

    @NotNull
    private String commonCdNm;

    @NotNull
    private String commonCdDesc;

    @NotNull
    private String commonGroupCdId;

    @NotNull
    private String commonGroupCdNm;

    @NotNull
    private String commonGroupCdDesc;

    private int commonSortSeq;

    private String commonCdEditYn;

    private String useYn;

    private String regId;

    private LocalDateTime regDtime;

    private String uptId;

    private LocalDateTime uptDtime;

    @Builder
    public CommonCode(long commonNo, String commonType, String commonCdId, String commonCdNm, String commonCdDesc,
                      String commonGroupCdId, String commonGroupCdNm, String commonGroupCdDesc, int commonSortSeq, String commonCdEditYn,
                      String useYn, String regId, LocalDateTime regDtime, String uptId, LocalDateTime uptDtime) {
        this.commonNo = commonNo;
        this.commonType = commonType;
        this.commonCdId = commonCdId;
        this.commonCdNm = commonCdNm;
        this.commonCdDesc = commonCdDesc;
        this.commonGroupCdId = commonGroupCdId;
        this.commonGroupCdNm = commonGroupCdNm;
        this.commonGroupCdDesc = commonGroupCdDesc;
        this.commonSortSeq = commonSortSeq;
        this.commonCdEditYn = commonCdEditYn;
        this.useYn = useYn;
        this.regId = regId;
        this.regDtime = regDtime;
        this.uptId = uptId;
        this.uptDtime = uptDtime;
    }

    @PrePersist
    public void prePersist() {
        Integer sortSeq = this.commonSortSeq;

        this.commonSortSeq = sortSeq.equals("") ? 1 : sortSeq;
        this.commonCdEditYn = this.commonCdEditYn.equals("") ? "Y" : this.commonCdEditYn;
        this.useYn = this.useYn.equals("") ? "Y" : this.useYn;
    }
}