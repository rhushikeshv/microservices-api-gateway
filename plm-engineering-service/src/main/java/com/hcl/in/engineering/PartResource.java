package com.hcl.in.engineering;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/service")
@CrossOrigin(origins = "*", maxAge = 3600)
public class PartResource {

    @CrossOrigin
    @GetMapping("/parts")
    public String getParts() {
        RestTemplate restTemplate = new RestTemplate();
        String partsURL
            = "https://qpi30wfl9e.execute-api.us-east-1.amazonaws.com/parts";
        ResponseEntity<String> response
            = restTemplate.getForEntity( partsURL , String.class);
        return response.getBody();
    }



}
