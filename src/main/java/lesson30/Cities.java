package lesson30;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Validated
@NoArgsConstructor
@Entity
@Table(name = "CITIES")
public class Cities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "city_name", nullable = false)
    private String city_name;

    @NotEmpty
    @Column(name = "city_name_on_english", nullable = false)
    private String city_name_on_english;

    @NotNull
    @Column(name = "population", nullable = false)
    private Integer population;

    @NotNull
    @Column(name = "city_code", nullable = false)
    private Integer city_code;


    public Cities (String city_name, String city_name_on_english, Integer population, Integer city_code) {
        this.city_name = city_name;
        this.city_name_on_english = city_name_on_english;
        this.population = population;
        this.city_code = city_code;
    }
}