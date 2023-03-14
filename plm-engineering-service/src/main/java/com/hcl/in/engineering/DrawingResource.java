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
public class DrawingResource {

    @CrossOrigin
    @GetMapping("/drawings")
    public String getDrawings() {
        RestTemplate restTemplate = new RestTemplate();
        String drawingURL
            = "https://g6oqupfyuj.execute-api.us-east-1.amazonaws.com/drawings";
        ResponseEntity<String> response
            = restTemplate.getForEntity( drawingURL , String.class);
        return response.getBody();
    }



}
