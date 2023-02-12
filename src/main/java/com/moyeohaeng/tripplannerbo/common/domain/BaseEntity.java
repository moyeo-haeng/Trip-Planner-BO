package com.moyeohaeng.tripplannerbo.common.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter @Setter
public class BaseEntity {

    private String reg_id;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime reg_dtime;

    private String upt_id;

    @LastModifiedDate
    private LocalDateTime upt_dtime;

}
