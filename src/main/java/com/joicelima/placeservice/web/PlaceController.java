package com.joicelima.placeservice.web;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joicelima.placeservice.api.PlaceRequest;
import com.joicelima.placeservice.domain.Place;
import com.joicelima.placeservice.domain.PlaceService;

import reactor.core.publisher.Mono;



@RestController
@RequestMapping("/places")
public class PlaceController {


    private PlaceService placeService;
    
    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }


    @PostMapping
    public ResponseEntity<Mono<Place>> create(@RequestBody PlaceRequest request){
        var createdPlace = placeService.create(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPlace);
    }

}
