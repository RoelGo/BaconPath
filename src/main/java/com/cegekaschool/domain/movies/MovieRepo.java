package com.cegekaschool.domain.movies;

import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.Set;

/**
 * Created by roelg on 28/02/2017.
 */
public interface MovieRepo extends GraphRepository <Movie>{
}
