package com.plav.user.controller;

import com.plav.user.entity.User;
import com.plav.user.service.JoinService;
import java.util.HashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/user/join")
public class JoinController {

    private final JoinService joinService;

    @PostMapping
    public ResponseEntity<Map<String, Object>> joinUser(@RequestBody User user) {
        log.info("request: {}", user);
        joinService.joinUser(user);

        Map<String, Object> result = new HashMap<>();
        result.put("data", user.getUserSeq());

        return ResponseEntity.ok().body(result);
    }
}
