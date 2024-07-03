package com.langscool.trip.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.langscool.trip.entity.TripEntity;

@Repository
public interface TripRepository extends JpaRepository<TripEntity, Long>{

    public void update(TripEntity trip);
    
}
