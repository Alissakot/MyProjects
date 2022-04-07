package lesson34.dto;

import lombok.Data;

import java.lang.reflect.Array;
import java.util.List;

@Data
public class Order {
    private Long id;
    private String fio;
    private String basket;
}
