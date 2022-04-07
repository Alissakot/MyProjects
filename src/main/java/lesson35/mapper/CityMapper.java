package lesson35.mapper;

import lesson35.dto.CityDto;
import lesson35.model.City;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Mapper
public interface CityMapper {

    @Mapping(target = "id", source = "entity.id")
    @Mapping(target = "city_Name", source = "entity.city_Name")
    @Mapping(target = "city_Name_On_English", source = "entity.city_Name_On_English")
    @Mapping(target = "population", source = "entity.population")
    @Mapping(target = "city_Code", source = "entity.city_Code")
    CityDto toDto(City entity);

    @Mapping(target = "id", source = "dto.id")
    @Mapping(target = "city_Name", source = "dto.city_Name")
    @Mapping(target = "city_Name_On_English", source = "dto.city_Name_On_English")
    @Mapping(target = "population", source = "dto.population")
    @Mapping(target = "city_Code", source = "dto.city_Code")
    City toEntity(CityDto dto);


    default List<CityDto> toDtos(List<City> entities) {
        return entities.stream().map(this::toDto).collect(Collectors.toList());
    }

    default Optional<CityDto> toOptionalDto(Optional<City> entity) {
        return entity.map(this::toDto);
    }
}
