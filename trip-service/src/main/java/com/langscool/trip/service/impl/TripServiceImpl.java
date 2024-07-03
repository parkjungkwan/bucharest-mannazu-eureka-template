package com.langscool.trip.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.langscool.trip.entity.TripEntity;
import com.langscool.trip.repository.TripRepository;
import com.langscool.trip.service.TripService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TripServiceImpl implements TripService {

    public final TripRepository tripRepository;
    
    @Override
    public List<TripEntity> findAll() {
        // TODO Auto-generated method stub
        
        return tripRepository.findAll();
    }

    @Override
    public Optional<TripEntity> findById(Long id) {
        // TODO Auto-generated method stub
        return tripRepository.findById(id);
    }

    @Override
    public TripEntity save(TripEntity trip) {
        // TODO Auto-generated method stub
        return tripRepository.save(trip);
    }

    @Override
    public void update(TripEntity trip) {
        // TODO Auto-generated method stub
        tripRepository.update(trip);
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        tripRepository.deleteById(id);
    }
    

    
}
