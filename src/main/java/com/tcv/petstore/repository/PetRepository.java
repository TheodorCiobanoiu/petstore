package com.tcv.petstore.repository;

import com.tcv.petstore.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Integer> {
    List<Pet> findAll();
    @Modifying
    @Query("UPDATE Pet t set t.stock = t.stock - 1 WHERE t.id = :petId")
    void decrementStock(Integer petId);
}
