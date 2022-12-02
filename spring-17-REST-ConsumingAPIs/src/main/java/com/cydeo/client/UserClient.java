package com.cydeo.client;

import com.cydeo.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url="https://jsonplaceholder.typicode.com/users", name = "USER-CLIENT")
public interface UserClient {

    //Whenever we call this getUsers method anywhere in the app->
    // It will hit/execute these endpoints : https://jsonplaceholder.typicode.com/users/users->
    // Then, json is coming and assigns to my own UserDto.
    @GetMapping("/users")
    List<User> getUsers();

}
