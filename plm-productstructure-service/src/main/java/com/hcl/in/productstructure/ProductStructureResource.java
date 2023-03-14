package com.hcl.in.productstructure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class ProductStructureResource {

    @GetMapping("/fetch")
    public String getECO() {
        return "Welcome to ProductStructure Microservice !!!";
    }

}
