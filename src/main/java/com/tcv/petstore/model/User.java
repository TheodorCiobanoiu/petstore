package com.tcv.petstore.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    UserType userType;
    String userName;
    @OneToMany
    @JsonManagedReference
    List<PurchaseHistory> purchaseHistory;
}
