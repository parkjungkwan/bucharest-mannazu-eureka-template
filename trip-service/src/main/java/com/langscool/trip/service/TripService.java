package com.langscool.trip.service;

import java.util.List;
import java.util.Optional;

import com.langscool.trip.entity.TripEntity;

public interface TripService {

    List<TripEntity> findAll();

    Optional<TripEntity> findById(Long id);

    TripEntity save(TripEntity trip);

    void update(TripEntity trip);

    void deleteById(Long id);

}
