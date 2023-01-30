package com.moyeohaeng.tripplannerbo.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("reservation")
public class ReservationController {
    @GetMapping("/initReservation")
    public String initReservation() {
        return "reservation/reservationInfo";
    }
}
