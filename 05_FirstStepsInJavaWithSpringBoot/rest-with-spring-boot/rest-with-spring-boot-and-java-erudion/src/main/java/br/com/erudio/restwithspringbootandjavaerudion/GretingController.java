package br.com.erudio.restwithspringbootandjavaerudion;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GretingController {
    
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/Greting")
    public Greting greting(
        @RequestParam(value = "name", defaultValue = "World")
        String name ){
            return new Greting(counter.incrementAndGet(), String.format(template, name));
        }
}

