package com.cegekaschool.domain.movies;

import com.cegekaschool.domain.persons.Person;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by roelg on 28/02/2017.
 */
@NodeEntity
public class Movie {
    @GraphId Long id;
    private String title;

    @Relationship(type = "DIRECTED", direction = Relationship.INCOMING)
    private Set<Person> directors = new HashSet<>();

    @Relationship(type = "ACTED_IN", direction = Relationship.INCOMING)
    private Set<Person> actors = new HashSet<>();


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Set<Person> getDirectors() {
        return directors;
    }

    public Set<Person> getActors() {
        return actors;
    }
}
