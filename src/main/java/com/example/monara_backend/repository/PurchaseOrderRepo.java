package com.example.monara_backend.repository;

import com.example.monara_backend.model.Purchase_Oder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseOrderRepo extends JpaRepository<Purchase_Oder,Integer> {
}
