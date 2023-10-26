package com.joicelima.placeservice.domain;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PlaceRespository extends ReactiveCrudRepository<Place, Long>{
    
}
