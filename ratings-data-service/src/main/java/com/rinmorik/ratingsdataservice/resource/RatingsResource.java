package com.rinmorik.ratingsdataservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rinmorik.ratingsdataservice.model.Rating;
import com.rinmorik.ratingsdataservice.model.UserRating;

@RestController
@RequestMapping("/rating")
public class RatingsResource {
	
	@RequestMapping("/{movieId}")
	public Rating getRatings(@PathVariable String movieId){
		
		return new Rating(movieId,4);
		
	}
	
	@RequestMapping("/user/{userId}")
	public UserRating getAllMovies(@PathVariable String userId){
		
		List<Rating> ratings = Arrays.asList(
				new Rating("1234",5),
				new Rating("5678",7)
				);
		
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		return userRating;
		
	}
	

}
