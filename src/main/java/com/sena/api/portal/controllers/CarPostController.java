package com.sena.api.portal.controllers;

import com.sena.api.portal.dto.CarPostDTO;
import com.sena.api.portal.message.KafkaProducerMessage;
import com.sena.api.portal.services.CarPostStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarPostController {

    @Autowired
    private CarPostStoreService carPostStoreService;

    @Autowired
    private KafkaProducerMessage kafkaProducerMessage;

    @PostMapping("/post")
    public ResponseEntity<CarPostDTO> postCarForSale(@RequestBody CarPostDTO carPostDTO) {
        kafkaProducerMessage.sendMessage(carPostDTO);
        return new ResponseEntity<>(carPostDTO, HttpStatus.OK);
    }

    @GetMapping("/posts")
    public ResponseEntity<List<CarPostDTO>> getCarSales() {
        return ResponseEntity.status(HttpStatus.FOUND).body(carPostStoreService.getCarForSales());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> changeCarSale(@RequestBody CarPostDTO carPostDTO, @PathVariable String id) {
        carPostStoreService.changeCarForSale(carPostDTO,id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCarForSale(@PathVariable String id) {
        carPostStoreService.removerCarForSale(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
