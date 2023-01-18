package com.accenture.XeTrainingApplication.controller;

import brave.Tracer;
import com.accenture.XeTrainingApplication.entity.User;
import com.accenture.XeTrainingApplication.repository.UserRepository;
import com.accenture.XeTrainingApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    private final UserRepository userRepo;

    Tracer tracer;

    @Autowired
    UserService userService;

    public DemoController(UserRepository userRepo, Tracer tracer) {
        this.userRepo = userRepo;
        this.tracer=tracer;
    }

    @GetMapping("/test/{id}")
    public ResponseEntity<?> test(@PathVariable(value = "id") long id) {
        System.out.println(tracer.currentSpan().context().traceIdString());
        return ResponseEntity.ok(userRepo.findById(id).get());
    }



//    @GetMapping("/test")
//    public List<User> getList() {
//        return userRepo.findAll();
//    }
}
