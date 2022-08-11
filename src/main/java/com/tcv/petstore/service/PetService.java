package com.tcv.petstore.service;

import com.tcv.petstore.model.Pet;
import com.tcv.petstore.repository.PetRepository;
import com.tcv.petstore.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PetService {
    private final PetRepository petRepository;
    private final UserRepository userRepository;
    public Pet savePet(Pet pet, Integer requestantId){

    }
}
