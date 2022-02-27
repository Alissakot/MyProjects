package lesson30;

import lesson30.dao.DaoCity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Savepoint;
import java.util.List;
@RequiredArgsConstructor
@ShellComponent
public class ShellScanner {

    @Autowired
    private final DaoCity daoCity;

    @ShellMethod(value = "save", key = {"save", "s"})
    @Transactional
    public void Save(String cityName, String cityNameEng, Integer pop, Integer cityCode) {
        Cities city = new Cities(cityName, cityNameEng, pop, cityCode);
        daoCity.save(city);
    }

    @ShellMethod(value = "findAll", key = {"findAll", "fa"})
    @Transactional(readOnly = true)
    public void findAll() {
        List<Cities> cityList = daoCity.findAll();
        for (int i = 0; i < cityList.size();i++)
        {
            System.out.println(cityList.get(i));
        }
    }

    @ShellMethod(value = "findByName", key = {"find", "fb"})
    @Transactional(readOnly = true)
    public void findAllByCity_nameOrCity_name_on_english(String name) {
        List<Cities> city = daoCity.findAllByCity_nameOrCity_name_on_english(name);
        for (int i = 0; i < city.size();i++)
        {
            System.out.println(city.get(i));
        }
    }
}
