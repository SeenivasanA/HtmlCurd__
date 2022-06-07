package com.example.htmlcurd.UserRepository;


import com.example.htmlcurd.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends JpaRepository<User,String> {
}
