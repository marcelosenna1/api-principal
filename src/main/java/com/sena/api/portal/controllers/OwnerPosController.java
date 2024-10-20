package com.sena.api.portal.controllers;

import com.sena.api.portal.dto.OwnerPostDTO;
import com.sena.api.portal.services.OwnerPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/owner")
public class OwnerPosController {

    @Autowired
    private OwnerPostService ownerPostService;

    @PostMapping
    public ResponseEntity createOwnerCar(@RequestBody OwnerPostDTO ownerPostDTO){
        ownerPostService.createOwnerCar(ownerPostDTO);
        return ResponseEntity.ok().build();
    }
}
