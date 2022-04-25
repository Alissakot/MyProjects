package lesson43.repository;

import lesson43.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "cities")
public interface CityRep extends JpaRepository<City, Long> {
}

