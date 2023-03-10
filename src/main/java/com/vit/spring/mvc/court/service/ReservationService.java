package com.vit.spring.mvc.court.service;

import com.vit.spring.mvc.court.domain.Reservation;

import java.util.List;

public interface ReservationService {

    List<Reservation> query(String courtName);
}
