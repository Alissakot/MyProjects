package lesson40;

import com.github.cloudyrock.spring.v5.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableMongock
@SpringBootApplication
public class MongoRunner {

    public static void main(String[] args) {
        final ConfigurableApplicationContext applicationContext = SpringApplication.run(MongoRunner.class, args);
    }
}