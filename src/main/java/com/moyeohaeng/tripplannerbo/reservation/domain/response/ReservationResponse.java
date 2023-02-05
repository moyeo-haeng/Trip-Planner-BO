package com.moyeohaeng.tripplannerbo.reservation.domain.response;

import com.moyeohaeng.tripplannerbo.reservation.domain.Reservation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationResponse {
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

    public ReservationResponse(final Reservation reservation) {
        this.reservation_no = reservation.getReservation_no();
        this.reservation_divi_cd = reservation.getReservation_divi_cd();
        this.reservation_date = reservation.getReservation_no();
        this.reservation_amt = reservation.getReservation_amt();
        this.reservation_qty = reservation.getReservation_qty();
        this.reservation_total_amt = reservation.getReservation_total_amt();
        this.reg_id = reservation.getReg_id();
        this.reg_dtime = reservation.getReg_dtime();
        this.upt_id = reservation.getUpt_id();
        this.upt_dtime = reservation.getUpt_dtime();
    }
}
