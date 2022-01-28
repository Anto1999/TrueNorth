package com.TrueNorth.vhs.service;

import com.TrueNorth.vhs.entity.Rental;
import com.TrueNorth.vhs.repository.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalService {
    private final RentalRepository rentalRepository;

    @Autowired
    public RentalService(RentalRepository rentalRepository){
        this.rentalRepository=rentalRepository;
    }

    public List<Rental> getRental(){
        return rentalRepository.findAll();
    }
}
