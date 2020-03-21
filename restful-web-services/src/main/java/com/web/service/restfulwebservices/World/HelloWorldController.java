package com.web.service.restfulwebservices.World;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path="/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path="/hello-world-bean")
    public HeloWorldBean helloWorldBean() {
        return new HeloWorldBean("Hello World");
    }

    @GetMapping(path="/hello-world/path-variable/{name}")
    public HeloWorldBean helloWorldVariable(@PathVariable String name) {
        return new HeloWorldBean(String.format("Hello, %s", name));
    }
}
