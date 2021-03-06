package lesson43.controller;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.MeterRegistry;
import lesson43.annotation.PositiveOrZero;
import lesson43.dto.CityDto;
import lesson43.dto.MainDto;
import lesson43.service.CityService;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Positive;

@Controller
@Validated
@RequiredArgsConstructor
public class CityController {
    private final MeterRegistry registry;
    private final CityService cityService;

    @GetMapping("/cities")
    public String index(Model model,
                        @PositiveOrZero(originValue = 15) @RequestParam(required = false, defaultValue = "0") Integer page,
                        @Positive @RequestParam(required = false, defaultValue = "7") Integer size) {
        MainDto allCity = cityService.getPage(PageRequest.of(page, size));
        model.addAttribute("cities", allCity);
        return "city/cities";
    }

    @GetMapping("/city/add")
    public String newCity(Model model) {
        return "city/city";
    }

    @Timed(value = "timer.saves", histogram = true, description = "Time for save city", percentiles = 0.95)
    @GetMapping("/city/edit")
    public String currentCity(@RequestParam("id") Long cityId, Model model) {
        CityDto currentCity = cityService.getById(cityId)
                .orElseThrow(() -> new IllegalArgumentException("Нет такого города"));
        model.addAttribute("city", currentCity);
        registry.counter("edit.counter").increment();
        return "city/city";
    }

    @Timed(value = "timer.saves", histogram = true, description = "Time for save city", percentiles = 0.95)
    @PostMapping("/city/save")
    public String saveCity(CityDto city) {
        registry.counter("save.counter").increment();
        cityService.save(city);
        return "redirect:/cities";
    }

}