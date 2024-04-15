package com.texas.ecs.controller;

import com.texas.ecs.dto.UserDto;
import com.texas.ecs.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public ResponseEntity saveUser(@RequestBody UserDto userDto){
        Integer data = userService.save(userDto);
        return ResponseEntity.ok(
                Map.of("message","User Saved Successfully..")
        );
    }

    @GetMapping("/id/{id}")
    public ResponseEntity fetchUserById(@PathVariable("id") Integer id){
        UserDto data = userService.getById(id);
        return ResponseEntity.ok(
                Map.of("message","User Fetched Successfully..","data",data)
        );
    }

    @GetMapping("/list")
    public ResponseEntity fetchAllUsers(){
        List<UserDto> data = userService.getAll();
        return ResponseEntity.ok(
                Map.of("message","User List Fetched Successfully..","data",data)
        );
    }
}
