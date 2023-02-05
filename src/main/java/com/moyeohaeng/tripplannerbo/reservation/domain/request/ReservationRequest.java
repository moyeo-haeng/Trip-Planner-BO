package com.moyeohaeng.tripplannerbo.reservation.domain.request;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class ReservationRequest {
    private String reservation_no;
    private String reservation_divi_cd;
    private String reservation_date;
    private Long reservation_amt;
    private Long reservation_qty;
    private Long reservation_total_amt;
    private String reg_id;
    private LocalDateTime reg_dtime;
    private String upt_id;
    private LocalDateTime upt_dtime;

    @Builder
    public ReservationRequest(String reservation_no, String reservation_divi_cd, String reservation_date, Long reservation_amt, Long reservation_qty, Long reservation_total_amt, String reg_id, LocalDateTime reg_dtime, String upt_id, LocalDateTime upt_dtime) {
        this.reservation_no = reservation_no;
        this.reservation_divi_cd = reservation_divi_cd;
        this.reservation_date = reservation_date;
        this.reservation_amt = reservation_amt;
        this.reservation_qty = reservation_qty;
        this.reservation_total_amt = reservation_total_amt;
        this.reg_id = reg_id;
        this.reg_dtime = reg_dtime;
        this.upt_id = upt_id;
        this.upt_dtime = upt_dtime;
    }


}
