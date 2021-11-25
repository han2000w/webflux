package com.webflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ExampleController {

    @GetMapping("/echo")
    public Mono<String> routeEcho2(){
        return Mono.just("Hello");
    }
}
