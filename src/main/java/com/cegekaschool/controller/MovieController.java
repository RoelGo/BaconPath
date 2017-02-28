package com.cegekaschool.controller;

import com.cegekaschool.domain.movies.Movie;
import com.cegekaschool.domain.movies.MovieRepo;
import com.cegekaschool.domain.persons.Person;
import com.cegekaschool.domain.persons.PersonRepo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by roelg on 28/02/2017.
 */
@RestController
@RequestMapping(path = "/movie")
public class MovieController {

    @Resource
    MovieRepo movieRepo;

    @RequestMapping(method = RequestMethod.GET)
    public List<Movie> getAllMovies(){
        return (List<Movie>) movieRepo.findAll();
    }



}
