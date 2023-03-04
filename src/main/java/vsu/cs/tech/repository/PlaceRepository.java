package vsu.cs.tech.repository;

import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import vsu.cs.tech.entity.Place;

import java.util.List;

public interface PlaceRepository extends MongoRepository<Place, String> {
    public Place findByName(String name);

    public List<Place> findAll();

    public Place findByLocation(GeoJsonPoint point);

}
