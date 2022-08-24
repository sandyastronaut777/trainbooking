package com.booking.trainbooking.controller;

import com.booking.trainbooking.model.UserRequestDTO;
import com.booking.trainbooking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/create")
    ResponseEntity<String> create(@RequestBody UserRequestDTO userRequestDTO){

        return new ResponseEntity<>("created", HttpStatus.OK);
    }

    @GetMapping("/get")
    ResponseEntity<String> get(@RequestBody UserRequestDTO userRequestDTO){

        return new ResponseEntity<>("fetched", HttpStatus.OK);
    }

    @PutMapping("/update")
    ResponseEntity<String> update(@RequestBody UserRequestDTO userRequestDTO){

        return new ResponseEntity<>("updated", HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    ResponseEntity<String> delete(@RequestBody UserRequestDTO userRequestDTO){

        return new ResponseEntity<>("deleted", HttpStatus.OK);
    }
}
