package lesson35.service;

import lesson35.dto.CityDto;
import lesson35.dto.MainDto;
import lesson35.mapper.CityMapper;
import lesson35.model.City;
import lesson35.repository.CityRep;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRep cityRep;
    private final CityMapper cityMapper;

    @Override
    @Transactional(readOnly = true)
    public List<CityDto> findAll() {
        return cityMapper.toDtos(cityRep.findAll());
    }

    @Override
    public MainDto getPage(Pageable pageable) {
        Page<City> currentPage = cityRep.findAll(pageable);
        return new MainDto(cityMapper.toDtos(currentPage.getContent()),
                currentPage.getNumber(),
                currentPage.getTotalPages(),
                currentPage.hasNext(),
                currentPage.hasPrevious());
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<CityDto> getById(@NotEmpty Long cityId) {
        return cityMapper.toOptionalDto(cityRep.findById(cityId));
    }

    @Override
    @Transactional
    public CityDto save(@Valid CityDto city) {
        return cityMapper.toDto(cityRep.save(cityMapper.toEntity(city)));
    }

    @Override
    @Transactional
    public void deleteById(@NotEmpty Long cityId) {
        cityRep.deleteById(cityId);
    }
}

