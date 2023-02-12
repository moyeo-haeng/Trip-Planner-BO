package com.moyeohaeng.tripplannerbo.reservation.domain;

import com.moyeohaeng.tripplannerbo.common.domain.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Reservation extends BaseEntity {

    @Id @GeneratedValue
    private String reservation_no;

    private String reservation_divi_cd;

    private String reservation_date;

    private Long reservation_amt;

    private Long reservation_qty;

    private Long reservation_total_amt;
}
