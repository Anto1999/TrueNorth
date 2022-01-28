package com.TrueNorth.vhs.service;

import com.TrueNorth.vhs.entity.Vhs;
import com.TrueNorth.vhs.repository.VhsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


}
