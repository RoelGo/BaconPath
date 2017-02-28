package com.cegekaschool.domain.persons;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.neo4j.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by roelg on 28/02/2017.
 */
public interface PersonRepo extends GraphRepository<Person>{
    @Query("MATCH p=shortestPath(\n" +
            "  (bacon:Person {name:\"Kevin Bacon\"})-[*]-(meg:Person {name:\"Meg Ryan\"})\n" +
            ")\n" +
            "RETURN p")
    List<Person> getBacon();

    @Query("MATCH p=shortestPath(\n" +
            "  (bacon:Person {name:\"Kevin Bacon\"})-[*]-(meg:Person {name: {name} } )\n" +
            ")\n" +
            "RETURN p")
    List<Person> getBacon(@Param("name") String name);
//
//    @Query("MATCH p=shortestPath(\n" +
//            "  (bacon:Person {name:\"Kevin Bacon\"})-[*]-(meg:Person {name:\"Meg Ryan\"})\n" +
//            ")\n" +
//            "RETURN nodes(p)")
//    int getBaconLength();

}
