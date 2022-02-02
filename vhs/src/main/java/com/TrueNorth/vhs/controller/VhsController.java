package com.TrueNorth.vhs.controller;


import com.TrueNorth.vhs.entity.Vhs;

import com.TrueNorth.vhs.repository.VhsRepository;
import com.TrueNorth.vhs.request.VhsRequest;
import com.TrueNorth.vhs.service.VhsService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/vhs")
public class VhsController {
    private final VhsService vhsService;

    @Autowired
    private VhsRepository vhsRepository;
    @Autowired
    public VhsController(VhsService vhsService){
        this.vhsService=vhsService;
    }



    @GetMapping("/all")
    public List<Vhs> getVhs(){
        return vhsService.getVhs();
    }

    @PostMapping("/create")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Vhs> createVhs(@RequestBody VhsRequest vhs){
        vhsService.createVhs(vhs);
        return ResponseEntity.ok().build();

    }


}
