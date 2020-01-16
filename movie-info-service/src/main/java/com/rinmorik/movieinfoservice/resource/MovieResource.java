package com.rinmorik.movieinfoservice.resource;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rinmorik.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movie")
public class MovieResource {
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId){
		
		
		return new Movie(movieId,"Test name");
				
				
				
		
	}

}
