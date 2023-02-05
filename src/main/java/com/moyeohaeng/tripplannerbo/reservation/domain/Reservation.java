package com.moyeohaeng.tripplannerbo.reservation.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Reservation {

    @Id @GeneratedValue
    private String reservation_no;

    private String Reservation_divi_cd;

    private String reservation_date;

    private Long reservation_amt;

    private Long reservation_qty;

    private Long reservation_total_amt;

    private String reg_id;

    private LocalDateTime reg_dtime;

    private String upt_id;

    private LocalDateTime upt_dtime;
}
