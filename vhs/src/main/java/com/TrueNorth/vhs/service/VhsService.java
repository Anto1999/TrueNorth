package com.TrueNorth.vhs.service;

import com.TrueNorth.vhs.entity.Rental;
import com.TrueNorth.vhs.entity.Vhs;
import com.TrueNorth.vhs.exception.ResourceNotFoundException;
import com.TrueNorth.vhs.repository.VhsRepository;
import com.TrueNorth.vhs.request.RentalRequest;
import com.TrueNorth.vhs.request.VhsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import com.TrueNorth.vhs.request.RentalRequest;

import java.util.List;
import java.util.Optional;

@Service
public class VhsService {

    private final  VhsRepository vhsRepository;

    @Autowired
    public VhsService(VhsRepository vhsRepository){
        this.vhsRepository=vhsRepository;
    }

    public  List<Vhs> getVhs(){
        return vhsRepository.findAll();
    }

    public Vhs createVhs(VhsRequest vhsRequest){
        Vhs vhs = new Vhs();

        vhs.setTitle(vhsRequest.getTitle());
        if(vhs.getTitle() == null || vhs.getTitle().isBlank()){
            throw new ResourceNotFoundException("Vhs requires title");
        }
        vhs.setPublished(vhsRequest.getPublished());


        return vhsRepository.save(vhs);
    }

    public void deleteVhs(Long vhsId ){
        vhsRepository.findById(vhsId)
                        .orElseThrow(() -> new ResourceNotFoundException("Not found vhs with id:"+vhsId));
        vhsRepository.deleteById(vhsId);

    }




}
