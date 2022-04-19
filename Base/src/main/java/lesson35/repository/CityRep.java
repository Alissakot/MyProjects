package lesson35.repository;

import lesson35.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRep extends JpaRepository<City, Long> {
}

