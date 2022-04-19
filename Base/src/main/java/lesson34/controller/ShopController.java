package lesson34.controller;

import lesson34.dto.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Shop")
@RequiredArgsConstructor
public class ShopController {


        @GetMapping({"/show"})
        public Order getById(@PathVariable Integer id, @RequestHeader("Accept-encoding") String encoding) {
                return new Order();
        }

        @ResponseStatus(HttpStatus.CREATED)
        //@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
        @PostMapping("/order")
        public Order createOrder(@RequestBody Order order) {
                return new Order();
        }

        @PutMapping
        public Order updateOrder(@RequestBody Order order) {
                return new Order();
        }

        @PatchMapping
        public Order updatePartialOrder(@RequestBody Order order) {
                return new Order();
        }

        @ResponseStatus(HttpStatus.NO_CONTENT)
        @DeleteMapping("/{id}")
        public void deleteOrder(@PathVariable Integer id) {

        }
}
