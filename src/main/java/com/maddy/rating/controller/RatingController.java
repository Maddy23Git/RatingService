package com.maddy.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maddy.rating.entities.Rating;
import com.maddy.rating.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService ratingService;

	@PostMapping
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
		Rating savedRating = ratingService.saveRating(rating);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedRating);
	}

	// Get Ratings by UserId
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId) {
		List<Rating> ratingList = ratingService.getRatingsByUserId(userId);
		// return ResponseEntity.ok(rating);
		return ResponseEntity.status(HttpStatus.OK).body(ratingList);
	}

	// Get Ratings by HotelId
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable Integer hotelId) {
		List<Rating> ratingList = ratingService.getRatingsByHotelId(hotelId);
		// return ResponseEntity.ok(rating);
		return ResponseEntity.status(HttpStatus.OK).body(ratingList);
	}

	// Get All Ratings
	@GetMapping
	public ResponseEntity<List<Rating>> getAllRatings() {
		List<Rating> ratingList = ratingService.getAllRatings();
		// return ResponseEntity.ok(ratingList);
		return ResponseEntity.status(HttpStatus.OK).body(ratingList);
	}

}
