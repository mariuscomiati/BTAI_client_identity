package org.pg.eureka.server.client.identity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class RootController {

    private Random random = new Random(0);

    @GetMapping
    public ResponseEntity<Boolean> isExistingClient(@RequestParam String cnp) {
        if (random.nextInt(150) < 100) {
            return ResponseEntity.ok(false);
        }
        return ResponseEntity.ok(true);
    }

}
