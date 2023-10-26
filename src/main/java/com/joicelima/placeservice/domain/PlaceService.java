package com.joicelima.placeservice.domain;

import reactor.core.publisher.Mono;

public class PlaceService {
    private PlaceRespository placeRespository;

    public PlaceService(PlaceRespository placeRespository) {
        this.placeRespository = placeRespository;
    }

    public Mono<Place> create(Place place){
        return placeRespository.save(place);
    }
    
}
