package com.cegekaschool.domain.persons;

import com.cegekaschool.domain.movies.Movie;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

import static org.neo4j.ogm.annotation.Relationship.OUTGOING;

/**
 * Created by roelg on 28/02/2017.
 */
@NodeEntity
public class Person {
    @GraphId
    Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
