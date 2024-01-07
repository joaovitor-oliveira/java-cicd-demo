package com.joaovitor.democicd;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class DemoController {

    @GetMapping("/calcularSoma")
    public ResponseEntity<Integer> getSum(@RequestParam(name = "a") Integer a, @RequestParam(name = "b") Integer b) {
        if(a == null || b == null)
            return ResponseEntity.badRequest().build();

        return ResponseEntity.status(HttpStatus.OK).body(a + b);
    }
}
