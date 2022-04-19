package lesson30.dao;
import lesson30.Cities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.validation.Valid;
import java.util.List;

public interface DaoCity extends JpaRepository<Cities, Long> {
    List<Cities> findAll();
    Cities save(@Valid Cities city);

    @Query(value = "select e from Cities e where e.city_name = :city_name or e.city_name_on_english = :city_name")
    List<Cities> findAllByCity_nameOrCity_name_on_english(String city_name);

}