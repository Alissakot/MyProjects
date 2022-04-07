package lesson35.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class CityDto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min = 1, max = 120)
    private String city_Name;

    @NotEmpty
    @Size(min = 1, max = 120)
    private String city_Name_On_English;

    @NotNull
    @Size(min = 1, max = 120)
    private int population;

    @NotNull
    @Size(min = 1, max = 7)
    private int city_Code;

    public String getIdStr() {
        return String.format("city_%s", id);
    }
}
