package com.accenture.XeTrainingApplication.service;

import com.accenture.XeTrainingApplication.entity.User;
import com.accenture.XeTrainingApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public User addUser(User user){
        return repository.save(user);
    }

    public List<User> getUsers(){
        return repository.findAll();
    }

    public void deleteUser(long id){
        repository.deleteById(id);
    }

    public User updateUser(User user){
        return repository.save(user);
    }


}
