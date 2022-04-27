package lesson43.controller;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.binder.BaseUnits;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricCounterController {

    private final MeterRegistry registry;

    public MetricCounterController(MeterRegistry registry) {
        this.registry = registry;

        Counter.builder("save.counter")
                .baseUnit(BaseUnits.EVENTS)
                .description("The number of saveCity methods")
                .register(registry);

        Counter.builder("edit.counter")
                .baseUnit(BaseUnits.EVENTS)
                .description("The number of edit calls")
                .register(registry);

    }
}