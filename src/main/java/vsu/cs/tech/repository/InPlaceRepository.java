package vsu.cs.tech.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vsu.cs.tech.entity.InPlace;

import java.util.List;
import java.util.Optional;

public interface InPlaceRepository extends MongoRepository<InPlace, String> {

    List<InPlace> findAll();
}
