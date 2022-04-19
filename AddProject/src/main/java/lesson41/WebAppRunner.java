package lesson41;

import lesson41.model.City;
import lesson41.repository.CityRep;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.reactive.function.server.RouterFunction;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;


@EnableMongoRepositories
@SpringBootApplication
public class WebAppRunner {

    public static void main(String[] args) {
        SpringApplication.run(WebAppRunner.class, args);
    }

    @Bean
    public RouterFunction<ServerResponse> composedRoutes(CityRep cityRep) {
        return route()
                .GET("/api/cities", accept(APPLICATION_JSON),
                        request -> ok().contentType(APPLICATION_JSON).body(cityRep.findAll(), City.class)
                )
                .DELETE("/api/cities/{id}",
                        request -> cityRep.deleteById(request.pathVariable("id")).flatMap(v -> ok().build())
                ).build();
    }
}