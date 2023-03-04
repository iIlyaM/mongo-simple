package vsu.cs.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vsu.cs.tech.entity.InPlace;
import vsu.cs.tech.repository.InPlaceRepository;
import vsu.cs.tech.repository.PlaceRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class InPlaceController {
    @Autowired
    private InPlaceRepository inPlaceRepository;

    @PostMapping("/in_places")
    public void addPlaces(@RequestBody final List<InPlace> places) {
        for (var place: places) {
            place.populateCreatedAt();
            inPlaceRepository.save(place);
        }
    }

    @GetMapping("/places")
    public List<InPlace> findPlaces() {
        return inPlaceRepository.findAll();
    }

    @GetMapping("/places/{id}")
    public List<InPlace> findPlace(@PathVariable final String id) {
        return inPlaceRepository.findAll().stream()
                .filter(val -> val.getPlace_id().equals(id))
                .collect(Collectors.toList());
    }
}

