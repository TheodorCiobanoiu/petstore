package com.tcv.petstore.service;

import com.tcv.petstore.model.User;
import com.tcv.petstore.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }
}
