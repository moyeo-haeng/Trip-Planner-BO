package com.moyeohaeng.tripplannerbo.reservation.controller;

import com.moyeohaeng.tripplannerbo.reservation.domain.Reservation;
import com.moyeohaeng.tripplannerbo.reservation.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("reservation")
public class ReservationController {

    private final ReservationService reservationService;

    @GetMapping("/initReservation")
    public String initReservation() {
        return "reservation/reservationInfo";
    }

    @GetMapping("/findReservationInfo")
    @ResponseBody
    public List<Reservation>  findReservationInfo() {
        return reservationService.findReservationInfo();
    }
}
