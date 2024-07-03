package com.langscool.trip.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.langscool.trip.domain.TripDTO;
import com.langscool.trip.entity.TripEntity;
import com.langscool.trip.service.TripService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/trips")
@RequiredArgsConstructor
public class TripController {
    
    private final TripService tripService;

    @GetMapping("")
    public List<TripEntity> getTripList(){
        return tripService.findAll();
    }
    // Optional<T> findById(ID id)
    @GetMapping("/{id}")
    public Optional<TripEntity> findById(@PathVariable Long id){
        return tripService.findById(id);
    }

    @PostMapping("")
    public TripEntity createTrip(@RequestBody TripEntity trip){
        return tripService.save(trip);
    }

    @PutMapping("/title/{id}")
    public String updateTrip(@RequestBody TripEntity trip){
        tripService.updateTitleById(trip);
        return "SUCCESS";
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Long id){
        tripService.deleteById(id);
        return "SUCCESS";
    }


}
