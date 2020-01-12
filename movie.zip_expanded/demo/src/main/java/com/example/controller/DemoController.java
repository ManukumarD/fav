package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Movies;

@RestController
@RequestMapping("/movies/")
public class DemoController {

	@RequestMapping("search/j/2")
	
	public @ResponseBody List<Movies> getMovieList() {
		List<Movies> list = new ArrayList<Movies>();
		Movies movie = new Movies();
		movie.setMovieName("Jumanji");
		Movies movie2 = new Movies();
		movie2.setMovieName("Jurrasic Park");
		list.add(movie);
		list.add(movie2);
		return list;
	}

	@RequestMapping("search/t/3")
	public @ResponseBody List<Movies> getMovie() {
		List<Movies> list = new ArrayList<Movies>();
		Movies movie = new Movies();
		movie.setMovieName("Dark Night");
		Movies movie2 = new Movies();
		movie2.setMovieName("The Monster");
		Movies movie3 = new Movies();
		movie3.setMovieName("The Exorcist");
		list.add(movie);
		list.add(movie2);
		list.add(movie3);

		return list;

	}

}
