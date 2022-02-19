package lesson28;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Starter {
    public static void main(String[] args) {
        final ConfigurableApplicationContext appContext = SpringApplication.run(Starter.class, args);
        final Choose choose = appContext.getBean(Choose.class);
        String userChoose = choose.choose();
        if (userChoose.equals("1")) {
            final Archivarius archivarius = appContext.getBean(Archivarius.class);
            archivarius.pack();
        } else if (userChoose.equals("2")) {
            final UnArchivarius unArchivarius = appContext.getBean(UnArchivarius.class);
            unArchivarius.unpack();
        }
    }
}
