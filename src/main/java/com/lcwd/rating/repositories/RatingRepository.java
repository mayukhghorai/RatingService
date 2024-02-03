package com.lcwd.rating.repositories;

import com.lcwd.rating.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<Rating, String> {
    public List<Rating> findByUserId(String userId);

    public List<Rating> findByHotelId(String hotelId);
}
