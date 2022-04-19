package lesson41.repository;

import lesson41.model.City;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CityRep extends ReactiveMongoRepository<City, String> {
}

