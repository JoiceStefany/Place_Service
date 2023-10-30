package com.joicelima.placeservice.domain;

import com.joicelima.placeservice.api.PlaceRequest;

import reactor.core.publisher.Mono;

public class PlaceService {
    private PlaceRespository placeRespository;

    public PlaceService(PlaceRespository placeRespository) {
        this.placeRespository = placeRespository;
    }

    public Mono<Place> create(PlaceRequest placeRequest){
        var place = new Place(id,placeRequest.name(), placeRequest.slug(),
        placeRequest.state(), placeRequest.createdAt(),
        placeRequest.updatedAt());
        return placeRespository.save(place);
    }
    
}
