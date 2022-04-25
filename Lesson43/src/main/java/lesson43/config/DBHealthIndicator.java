package lesson43.config;

import lesson43.repository.CityRep;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DBHealthIndicator implements HealthIndicator {

    private final CityRep cityRep;

    public DBHealthIndicator(CityRep cityRep) {
        this.cityRep = cityRep;
    }

    @Override
    public Health health() {
        long num = cityRep.count();
        if (num != 0) {
            return Health.up()
                    .withDetail("description", "Количество городов: " + num).build();
        } else {
            return Health.down()
                    .withDetail("description", "Городов в базе не найдено").build();
        }
    }
}