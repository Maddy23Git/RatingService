package com.maddy.rating.service;

import java.util.List;

import com.maddy.rating.entities.Rating;

public interface RatingService {

	Rating saveRating(Rating rating);

	List<Rating> getAllRatings();

	List<Rating> getRatingsByUserId(String userId);
	
	List<Rating> getRatingsByHotelId(Integer hotelId);
}
