package com.example.paymets.s.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.paymets.s.paymententity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
