package com.moyeohaeng.tripplannerbo.common.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

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
public class CommonGroupCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long commonGrpCdNo;

    @NotNull
    private String commonType;

    @NotNull
    private String commonGrpCdId;

    @NotNull
    private String commonGrpCdNm;

    private String commonGrpCdDesc;

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
    public CommonGroupCode(long commonGrpCdNo, String commonType, String commonGrpCdId, String commonGrpCdNm, String commonGrpCdDesc, int commonSortSeq
            , String useYn, String regId, LocalDateTime regDtime, String uptId, LocalDateTime uptDtime) {
        this.commonGrpCdNo = commonGrpCdNo;
        this.commonType = commonType;
        this.commonGrpCdId = commonGrpCdId;
        this.commonGrpCdNm = commonGrpCdNm;
        this.commonGrpCdDesc = commonGrpCdDesc;
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

        this.commonGrpCdDesc = "".equals(this.commonGrpCdDesc) ? null : this.commonGrpCdDesc;
        this.commonSortSeq = sortSeq.equals("") ? 1 : sortSeq;
        this.useYn = this.useYn.equals("") ? "Y" : this.useYn;
    }
}
