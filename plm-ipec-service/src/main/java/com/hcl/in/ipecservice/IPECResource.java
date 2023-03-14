package com.hcl.in.ipecservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class IPECResource {

    @GetMapping("/fetch")
    public String getECO() {
        return "Welcome to IPEC Microservice !!!";
    }

}
