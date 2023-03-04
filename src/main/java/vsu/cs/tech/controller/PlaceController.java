package vsu.cs.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vsu.cs.tech.entity.Place;
import vsu.cs.tech.repository.PlaceRepository;

import java.util.List;

@RestController
public class PlaceController {
    @Autowired
    private PlaceRepository placeRepository;

    @PostMapping("/places")
    public void addPersons(@RequestBody final List<Place> places) {
        placeRepository.saveAll(places);
    }

    @GetMapping("/places/")
    public List<Place> findPlaces() {
        return placeRepository.findAll();
    }

    @GetMapping("/places/{name}")
    public Place findPerson(@PathVariable final String name) {
        return placeRepository.findByName(name);
    }
}
