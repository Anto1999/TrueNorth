package com.TrueNorth.vhs.controller;

import com.TrueNorth.vhs.entity.Rental;
import com.TrueNorth.vhs.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/rental")
public class RentalController {
    private final RentalService rentalService;

    @Autowired
    public RentalController(RentalService rentalService){
        this.rentalService=rentalService;
    }

    @GetMapping
    public List<Rental> getRental(){
        return rentalService.getRental();
    }

}
