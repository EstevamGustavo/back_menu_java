package com.pastasciuttapizzaria.rest.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    @PostMapping(path = "/api/sabor")
    public String createSabor() {
        return "tsadasd";
    }

}
