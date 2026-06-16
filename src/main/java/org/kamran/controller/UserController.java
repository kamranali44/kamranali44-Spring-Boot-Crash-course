package org.kamran.controller;

import org.kamran.model.User;
import org.kamran.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getuser/{userName}")
    public ResponseEntity<User> getUser(@PathVariable("userName")  String userName) {
        return ResponseEntity.of(Optional.ofNullable(userService.getUser(userName)));
    }

    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        userService.addUser(user);
        return ResponseEntity.accepted().build();
    }

    @DeleteMapping("/deleteUser/{firstName}")
    public ResponseEntity<User> deleteUser(@PathVariable("firstName") String userName) {
        userService.deleteUser(userName);
        return ResponseEntity.noContent().build();
    }
}
