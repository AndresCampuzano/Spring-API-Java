package com.example.springapi.api.service;

import com.example.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        userList.add(new User(1, "John Doe", 30, "john.doe@example.com"));
        userList.add(new User(2, "Jane Smith", 25, "jane.smith@example.com"));
        userList.add(new User(3, "Alice Johnson", 28, "alice.johnson@example.com"));
    }

   public Optional<User> getUser(Integer id) {
       return userList.stream()
               .filter(user -> user.getId() == id)
               .findFirst();
   }
}
