package lesson41.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "cities")
public class City {

    @Id
    private String id;

    @NotNull
    private String city_name;

    @NotNull
    private String city_name_on_english;

    @NotNull
    private String population;

    @NotNull
    private String city_code;
}

