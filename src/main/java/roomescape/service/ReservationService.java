package roomescape.service;

import org.springframework.stereotype.Service;
import roomescape.domain.Reservation;
import roomescape.dto.ReservationDTO;
import roomescape.repository.ReservationRepository;

import java.util.List;

@Service
public class ReservationService {
    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository){
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> findAllReservations(){
        return reservationRepository.findAll();
    }

    public Long addReservation(ReservationDTO reservationDTO){
        return reservationRepository.addReservation(reservationDTO);
    }
}