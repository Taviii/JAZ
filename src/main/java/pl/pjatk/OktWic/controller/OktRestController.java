package pl.pjatk.OktWic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.OktWic.model.Car;

@RestController
@RequestMapping("/test")
public class OktRestController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHelloWorld() {
//        return ResponseEntity.status(HttpStatus.OK).body("Hello World");
        return ResponseEntity.ok("Hello World from ok");
    }

//    @PostMapping("/model")
//    public ResponseEntity<String> getModel(@RequestBody Car car){
//        return ResponseEntity.ok(car.name);
//    }

    @GetMapping("/model")
    public ResponseEntity<Car> getCar(Car car) {
        return ResponseEntity.ok(new Car("VW"));
    }

    @PostMapping("/model")
    public ResponseEntity<Car> postCar(@RequestBody Car car){
        return ResponseEntity.ok(car);
    }
}

