package com.rinmorik.moviecatalogservice.resource;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rinmorik.moviecatalogservice.model.Catalog;
import com.rinmorik.moviecatalogservice.model.Movie;
import com.rinmorik.moviecatalogservice.model.Rating;
import com.rinmorik.moviecatalogservice.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/{userId}")
	public List<Catalog> getcatalogList(@PathVariable String userId){
		
		 
		
		UserRating userRating = restTemplate.getForObject("http://ratings-data-service/rating/user/"+userId, UserRating.class);
				
		
				
		List<Catalog> catalogmovies = new ArrayList<Catalog>();
		for(Rating rating:userRating.getUserRating()) {
			
			Movie movie = restTemplate.getForObject("http://movie-info-service/movie/"+rating.getMovieId(), Movie.class);
			Catalog cat = new Catalog(movie.getName(), "test", rating.getRating());
			//System.out.println(cat);
			catalogmovies.add(cat);
		}
		
		return catalogmovies;
		
		
		
	}
	
	

}
