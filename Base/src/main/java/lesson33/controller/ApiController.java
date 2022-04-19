package lesson33.controller;

import lesson33.dto.ResultDto;
import lesson33.service.ApiConverterImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URISyntaxException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Converter")
public class ApiController {

    private final ApiConverterImpl apiConverterImpl;

    @PostMapping("/convert")
    public ResultDto convert(@RequestParam("value") BigDecimal value, @RequestParam("question") String question) throws URISyntaxException, IOException {
        return new ResultDto("Converter", apiConverterImpl.getValue(value, question));
    }
}
