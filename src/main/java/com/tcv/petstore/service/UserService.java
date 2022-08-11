package com.tcv.petstore.service;

import com.tcv.petstore.model.User;
import com.tcv.petstore.model.UserType;
import com.tcv.petstore.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User saveUser(User user, Optional<Integer> requestantId) {
        if (user.getUserType() == UserType.CLIENT)
            return userRepository.save(user);
        else if (user.getUserType() == UserType.OWNER && requestantId.isPresent()) {
            Optional<User> userN = userRepository.findById(requestantId.get());
            if (userN.isPresent() && userN.get().getUserType() == UserType.OWNER)
                return userRepository.save(user);
        }
        return null;
    }
}
