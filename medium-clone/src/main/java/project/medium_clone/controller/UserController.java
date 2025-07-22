package project.medium_clone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.medium_clone.model.User;
import project.medium_clone.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService ser;

    @GetMapping("")
    public List<User> findAll(){
        return ser.findAll();
    }

    @PostMapping("")
    public void addUser(@RequestBody User user){
        ser.addUser(user);
    }
}
