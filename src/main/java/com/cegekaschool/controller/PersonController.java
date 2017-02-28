package com.cegekaschool.controller;

import com.cegekaschool.domain.persons.Person;
import com.cegekaschool.domain.persons.PersonRepo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by roelg on 28/02/2017.
 */
@RestController
@RequestMapping(path = "/person")
public class PersonController {


    @Resource
    PersonRepo personRepo;

    @RequestMapping(method = RequestMethod.GET)
    public List<Person> getAllPeopel() {
        return (List<Person>) personRepo.findAll();
    }

    @RequestMapping(path = "/bacon", method = RequestMethod.GET)
    public List<Person> getBacon() {
        return personRepo.getBacon();
    }

    @RequestMapping(path = "/bacon/length", method = RequestMethod.GET)
    public int getBaconLenght() {
        return personRepo.getBacon().stream()
                .filter(person -> !person.getName().equals("Kevin Bacon"))
                .filter(person -> !person.getName().equals("Meg Ryan"))
                .toArray()
                .length
                ;
    }

    @RequestMapping(path = "/bacon/var", method = RequestMethod.GET)
    public int getBaconLenght(@RequestParam(value = "name") String name) {
        return personRepo.getBacon(name).stream()
                .filter(person -> person.getName().equals("Kevin Bacon"))
                .filter(person -> person.getName().equals(name))
                .toArray()
                .length;
    }

}
