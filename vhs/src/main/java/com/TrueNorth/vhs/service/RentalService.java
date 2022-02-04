package com.TrueNorth.vhs.service;

import com.TrueNorth.vhs.entity.Rental;
import com.TrueNorth.vhs.request.VhsRequest;
import com.TrueNorth.vhs.service.VhsService;
import com.TrueNorth.vhs.entity.User;
import com.TrueNorth.vhs.entity.Vhs;
import com.TrueNorth.vhs.repository.RentalRepository;
import com.TrueNorth.vhs.repository.VhsRepository;
import com.TrueNorth.vhs.request.RentalRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class RentalService {

    private final RentalRepository rentalRepository;
    VhsService vhsService;


    @Autowired
    public RentalService(RentalRepository rentalRepository){
        this.rentalRepository=rentalRepository;
    }



    public List<Rental> getRental(){
        return rentalRepository.findAll();
    }


    public Rental createRental(RentalRequest rentalRequest) {

        Rental rental = new Rental();
        rental.setUser(rentalRequest.getUser_id());
        rental.setVhs(rentalRequest.getVhs_id());
        rentalRepository.updateVhs(rental.getVhs().getVhsId());
        return rentalRepository.save(rental);

    }


    public void deleteRentalById(Long id){

      Optional<Rental> getRental = rentalRepository.findById(id);
      Rental rental =getRental.get();
      rentalRepository.setVhsToFalse(rental.getVhs().getVhsId());
      rentalRepository.deleteById(id);

    }

    public ResponseEntity<Rental> getRentalById(Long id){
        Optional<Rental> getRental = rentalRepository.findById(id);
        Rental rental= getRental.get();
        return new ResponseEntity<>(rental, HttpStatus.OK);
    }

    public Rental updateRental(RentalRequest rentalRequest,Long id){
        Optional<Rental> getRental = rentalRepository.findById(id);
        Rental rental=getRental.get();

        rental.setReturned(rentalRequest.getReturned());
        return rentalRepository.save(rental);

    }

}
