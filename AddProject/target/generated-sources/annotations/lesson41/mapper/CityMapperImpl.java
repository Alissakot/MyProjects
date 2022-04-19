package lesson41.mapper;

import javax.annotation.processing.Generated;
import lesson41.dto.CityDto;
import lesson41.model.City;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-19T23:16:08+0300",
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
        cityDto.setCity_name( entity.getCity_name() );
        cityDto.setCity_name_on_english( entity.getCity_name_on_english() );
        cityDto.setPopulation( entity.getPopulation() );
        cityDto.setCity_code( entity.getCity_code() );

        return cityDto;
    }

    @Override
    public City toEntity(CityDto entity) {
        if ( entity == null ) {
            return null;
        }

        City city = new City();

        city.setId( entity.getId() );
        city.setCity_name( entity.getCity_name() );
        city.setCity_name_on_english( entity.getCity_name_on_english() );
        city.setPopulation( entity.getPopulation() );
        city.setCity_code( entity.getCity_code() );

        return city;
    }
}
