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
    private String city_Name;

    @NotEmpty
    private String city_Name_On_English;

    @NotNull
    private int population;

    @NotNull
    private int city_Code;
}

