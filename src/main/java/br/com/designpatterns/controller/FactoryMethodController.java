package br.com.designpatterns.controller;

import br.com.designpatterns.service.FactoryMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/factoryMethod")
public class FactoryMethodController {

    @Autowired
    FactoryMethodService factoryMethodService;


    @GetMapping("/no-factory-method")
    public ResponseEntity<String> noFactoryMethod() {
        String returnFactory = factoryMethodService.noFactoryMethodIphone("X", "standard");
        return ResponseEntity.ok(returnFactory);
    }

    @GetMapping("/half-factory-method")
    public ResponseEntity<String> halfFactoryMethod() {
        String returnFactory = factoryMethodService.halfFactoryMethodIphone();
        return ResponseEntity.ok(returnFactory);
    }

    @GetMapping("/half-factory-method-1")
    public ResponseEntity<String> halfFactoryMethod1() {
        String returnFactory = factoryMethodService.half1FactoryMethodIphone("standard");
        return ResponseEntity.ok(returnFactory);
    }

    @GetMapping("/simple-factory-method")
    public ResponseEntity<String> simpleFactoryMethod() {
        String returnFactory = factoryMethodService.simpleFactoryMethodIphone("X", "standard");
        return ResponseEntity.ok(returnFactory);
    }

}
