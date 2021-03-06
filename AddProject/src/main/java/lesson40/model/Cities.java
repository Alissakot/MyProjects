package lesson40.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Document(collection = "cities")
public class Cities {

    @Id
    private String id;

    @NotEmpty
    private String city_name;

    @NotEmpty
    private String city_name_on_english;

    @NotNull
    private String population;

    @NotNull
    private String city_code;
}

