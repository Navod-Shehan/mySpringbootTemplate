//package com.springboot.myTemplate.controller;
//
//import com.springboot.myTemplate.entity.UserEntity;
//import com.springboot.myTemplate.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/v1")
//public class UserController {
//    private UserService userService;
//
//    @Autowired
//    public UserController(UserService theUserService){
//        this.userService=theUserService;
//    }
//
//    @GetMapping("users/{userId}")
//    public UserEntity getUser(@PathVariable int userId){
//        UserEntity theUser = userService.findById(userId);
//
//        if (theUser == null){
//            throw new RuntimeException("User id not found -" + userId);
//        }
//        return theUser;
//    }
//
//    @PostMapping("users")
//    public UserEntity addUser(@RequestBody UserEntity theUser){
//        theUser.setId(0);
//        UserEntity dbUser = userService.save(theUser);
//        return dbUser;
//    }
//
//    @PutMapping("users")
//    public UserEntity updateUser(@RequestBody UserEntity theUser){
//        UserEntity dbUser = userService.save(theUser);
//        return dbUser;
//    }
//
//    @DeleteMapping("users/{userId}")
//    public String deleteUser(@PathVariable int userId){
//        UserEntity theUser = userService.findById(userId);
//        if(theUser==null){
//            throw new RuntimeException("User id not found -" + userId);
//        }
//        userService.deleteById(userId);
//        return "Delete user id -" + userId;
//    }
//}
