package com.maddy.rating.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maddy.rating.entities.Rating;

public interface RatingRepository extends JpaRepository<Rating, Integer> {

	// Custom Finder Methods

	List<Rating> findByUserId(String userId);

	List<Rating> findByHotelId(Integer hotelId);
}
