package service;

import org.springframework.stereotype.Component;

@Component(value = "userService")
public class UserService {

    public void addUser()
    {
        System.out.println("add user...");
    }
}
