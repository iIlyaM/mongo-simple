package vsu.cs.tech.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import vsu.cs.tech.entity.Person;


public interface PersonRepository extends MongoRepository<Person, String> {

    public Person findByName(String name);

}
