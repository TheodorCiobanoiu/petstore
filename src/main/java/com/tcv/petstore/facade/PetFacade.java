package com.tcv.petstore.facade;

import com.tcv.petstore.model.Pet;
import com.tcv.petstore.service.PetService;
import com.tcv.petstore.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PetFacade {
    private final UserService userService;

    private final PetService petService;

    public Pet savePet(Pet pet, Integer requestantId) {
        if (!userService.isAdmin(requestantId))
            return null;
        return petService.savePet(pet);
    }
}
