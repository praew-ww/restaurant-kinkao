package th.ac.ku.restaurant.controller;

import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import th.ac.ku.restaurant.model.Restaurant;
import th.ac.ku.restaurant.service.RestaurantService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
    @Autowired
    private RestaurantService service;

    @GetMapping
    public List<Restaurant>getAll(){
        return service.getAll();
    }

    @PostMapping
    public Restaurant create(@RequestBody Restaurant restaurant){
//        System.out.println("Price range: " + restaurant.getPriceRange());
        return service.create(restaurant);
    }

    @DeleteMapping("/{id}")
    public Restaurant delete(@PathVariable UUID id){
        return service.delete(id);
    }

    @GetMapping("/{id}")
    public Restaurant getRestaurant(@PathVariable UUID id) {
        return service.getRestaurant(id);
    }

    @PutMapping("/{id}")
    public Restaurant update(@PathVariable UUID id, @RequestBody Restaurant restaurant) {
        return service.update(id, restaurant);
    }


}
