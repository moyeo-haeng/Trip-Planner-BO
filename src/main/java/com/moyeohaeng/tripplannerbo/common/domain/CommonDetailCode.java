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
public class CommonDetailCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long commonCdNo;

    @NotNull
    private long commonGrpCdNo; // CommonGroupCode.commonGrpCdNo

    @NotNull
    @Column(unique = true)
    private String commonCdId;

    @NotNull
    private String commonCdNm;

    private String commonCdDesc;

    private String commonTypeCd1;

    private String commonTypeCd2;

    private String commonTypeCd3;

    @NotNull
    private int commonSortSeq;

    @NotNull
    private String useYn;

    @NotNull
    private String regId;

    @NotNull
    private LocalDateTime regDtime;

    private String uptId;

    private LocalDateTime uptDtime;

    @Builder
    public CommonDetailCode(long commonCdNo, long commonGrpCdNo, String commonCdId, String commonCdNm, String commonCdDesc
            , String commonTypeCd1, String commonTypeCd2, String commonTypeCd3, int commonSortSeq
            , String useYn, String regId, LocalDateTime regDtime, String uptId, LocalDateTime uptDtime) {
        this.commonCdNo = commonCdNo;
        this.commonGrpCdNo = commonGrpCdNo;
        this.commonCdId = commonCdId;
        this.commonCdNm = commonCdNm;
        this.commonCdDesc = commonCdDesc;
        this.commonTypeCd1 = commonTypeCd1;
        this.commonTypeCd2 = commonTypeCd2;
        this.commonTypeCd3 = commonTypeCd3;
        this.commonSortSeq = commonSortSeq;
        this.useYn = useYn;
        this.regId = regId;
        this.regDtime = regDtime;
        this.uptId = uptId;
        this.uptDtime = uptDtime;
    }

    @PrePersist
    public void prePersist() {
        Integer sortSeq = this.commonSortSeq;

        this.commonCdDesc = "".equals(this.commonCdDesc) ? null : this.commonCdDesc;
        this.commonTypeCd1 = "".equals(this.commonTypeCd1) ? null : this.commonTypeCd1;
        this.commonTypeCd2 = "".equals(this.commonTypeCd2) ? null : this.commonTypeCd2;
        this.commonTypeCd3 = "".equals(this.commonTypeCd3) ? null : this.commonTypeCd3;
        this.commonSortSeq = sortSeq.equals("") ? 1 : sortSeq;
        this.useYn = this.useYn.equals("") ? "Y" : this.useYn;
    }
}
