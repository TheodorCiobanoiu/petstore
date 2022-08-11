package com.tcv.petstore.service;

import com.tcv.petstore.model.Pet;
import com.tcv.petstore.repository.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PetService {
    private final PetRepository petRepository;

    public Pet savePet(Pet pet) {
        return petRepository.save(pet);
    }
}
