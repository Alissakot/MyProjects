package lesson41.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityDto {

    private String id;

    @NotNull
    @Size(min = 1, max = 120)
    private String city_name;

    @NotNull
    @Size(min = 1, max = 120)
    private String city_name_on_english;

    @NotNull
    @Size(min = 1, max = 120)
    private String population;

    @NotNull
    @Size(min = 1, max = 7)
    private String city_code;
}
