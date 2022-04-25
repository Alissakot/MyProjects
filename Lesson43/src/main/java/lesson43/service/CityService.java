package lesson43.service;

import lesson43.dto.CityDto;
import lesson43.dto.MainDto;
import org.springframework.data.domain.Pageable;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Optional;

public interface CityService {
    List<CityDto> findAll();

    MainDto getPage(Pageable pageable);

    Optional<CityDto> getById(@NotEmpty Long cityId);

    CityDto save(@Valid CityDto city);

    void deleteById(@NotEmpty Long cityId);
}
