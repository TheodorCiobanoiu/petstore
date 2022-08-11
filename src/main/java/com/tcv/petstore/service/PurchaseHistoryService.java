package com.tcv.petstore.service;

import com.tcv.petstore.model.Pet;
import com.tcv.petstore.model.PurchaseHistory;
import com.tcv.petstore.model.User;
import com.tcv.petstore.repository.PetRepository;
import com.tcv.petstore.repository.PurchaseHistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PurchaseHistoryService {

    private final PurchaseHistoryRepository purchaseHistoryRepository;
    private final PetRepository petRepository;

    public PurchaseHistory savePurchaseHistory(User user, Integer petId){
        return purchaseHistoryRepository.save(PurchaseHistory.builder().user(user).pet(petRepository.findById(petId).get()).build());
    }
    public void updateStock(Integer petId){
        petRepository.decrementStock(petId);
    }
}
