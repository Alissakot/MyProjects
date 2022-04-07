package lesson35.mapper;

import javax.annotation.processing.Generated;
import lesson35.dto.CityDto;
import lesson35.model.City;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-07T23:09:07+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class CityMapperImpl implements CityMapper {

    @Override
    public CityDto toDto(City entity) {
        if ( entity == null ) {
            return null;
        }

        CityDto cityDto = new CityDto();

        cityDto.setId( entity.getId() );
        cityDto.setCity_Name( entity.getCity_Name() );
        cityDto.setCity_Name_On_English( entity.getCity_Name_On_English() );
        cityDto.setPopulation( entity.getPopulation() );
        cityDto.setCity_Code( entity.getCity_Code() );

        return cityDto;
    }

    @Override
    public City toEntity(CityDto dto) {
        if ( dto == null ) {
            return null;
        }

        City city = new City();

        city.setId( dto.getId() );
        city.setCity_Name( dto.getCity_Name() );
        city.setCity_Name_On_English( dto.getCity_Name_On_English() );
        city.setPopulation( dto.getPopulation() );
        city.setCity_Code( dto.getCity_Code() );

        return city;
    }
}
