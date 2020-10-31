package com.linebot.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IncomingController {

    @GetMapping()
    public ResponseEntity<?> incoming() {
        Map<String, Object> r = new HashMap<>();
        r.put("msg", "Hello Line bot");
        return ResponseEntity.ok(r);
    }
}
