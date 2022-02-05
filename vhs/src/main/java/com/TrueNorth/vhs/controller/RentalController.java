package com.TrueNorth.vhs.controller;
import java.util.Optional.*;
import com.TrueNorth.vhs.entity.Rental;
import com.TrueNorth.vhs.entity.Vhs;
import com.TrueNorth.vhs.exception.ResourceNotFoundException;
import com.TrueNorth.vhs.request.RentalRequest;
import com.TrueNorth.vhs.request.VhsRequest;
import com.TrueNorth.vhs.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/rental")
public class RentalController {
    private final RentalService rentalService;

    @Autowired
    public RentalController(RentalService rentalService){
        this.rentalService=rentalService;
    }

    @GetMapping(path = "/all")
    @PreAuthorize(" hasRole('ADMIN')")
    public List<Rental> getRental(){
        return rentalService.getRental();
    }


    //create
    @PostMapping(path="/create")
    @PreAuthorize(" hasRole('ADMIN')")
    public ResponseEntity<Rental> createRental(@RequestBody RentalRequest rentalRequest){
        rentalService.createRental(rentalRequest);

        return ResponseEntity.ok().build();

    }

    //get rental by id
    @GetMapping("/{rentalId}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Rental> getRental(@PathVariable Long rentalId){
        return rentalService.getRentalById(rentalId);

    }

    //delete rental by id
    @DeleteMapping("/{rentalId}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Rental> DeleteRental(@PathVariable Long rentalId){
        rentalService.deleteRentalById(rentalId);


        return ResponseEntity.ok().build();
    }

    @PutMapping("/{rentalId}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Rental> updateRental(@RequestBody RentalRequest rentalRequest,@PathVariable Long rentalId){
        rentalService.updateRental(rentalRequest,rentalId);
        return ResponseEntity.ok().build();
    }





}
