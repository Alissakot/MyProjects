package lesson35.controller;

import lesson35.dto.ResultDto;
import lesson35.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ControllerDel {

    private final CityService cityService;

    @DeleteMapping("/city/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long cityId) {
        cityService.deleteById(cityId);
        return ResponseEntity.ok(new ResultDto());
    }
}
