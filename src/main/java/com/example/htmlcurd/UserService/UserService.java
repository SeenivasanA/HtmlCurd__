package com.example.htmlcurd.UserService;

import com.example.htmlcurd.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private List<User> users= new ArrayList<>(Arrays.asList(
            new User("Ram","12345","190701011",987654322),
            new User("Santosh","54321","190701012",987654444),
            new User("Bala","12345","190701013",987654478)
    ));

    public List<User> getallUser(){
        return users;
    }
    public User getUser(String id) {
        return users.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
    public void addUser(User user) {
        users.add(user);
    }

    public void updateUser(String id, User user) {
    for(int i=0;i<users.size();i++){
        User u=users.get(i);
        if(u.getId().equals(id)){
            users.set(i, user);
            return;
        }
    }
    }

    public void deleteUser(String id) {
        users.removeIf(u -> u.getId().equals(id));
    }
}
