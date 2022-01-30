package com.TrueNorth.vhs.controller;


import com.TrueNorth.vhs.entity.Vhs;

import com.TrueNorth.vhs.service.VhsService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/vhs")
public class VhsController {
    private final VhsService vhsService;

    @Autowired
    public VhsController(VhsService vhsService){
        this.vhsService=vhsService;
    }

    @GetMapping
    public List<Vhs> getVhs(){
        return vhsService.getVhs();
    }




}
