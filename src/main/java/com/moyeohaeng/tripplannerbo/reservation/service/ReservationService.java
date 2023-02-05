package com.moyeohaeng.tripplannerbo.reservation.service;

import com.moyeohaeng.tripplannerbo.reservation.domain.Reservation;
import com.moyeohaeng.tripplannerbo.reservation.repository.ReservationCustomRepositoryImpl;
import com.moyeohaeng.tripplannerbo.reservation.repository.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ReservationService {

    private final ReservationCustomRepositoryImpl reservationCustomRepository;

    private final ReservationRepository reservationRepository;

    /**
     * 예약정보 조회
     * @Return : List
     */
    public List<Reservation> findReservationInfo() {
        return reservationRepository.findAll();
    }

}
