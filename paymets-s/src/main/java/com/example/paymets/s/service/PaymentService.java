package com.example.paymets.s.service;

import com.example.paymets.s.dto.PaymentCreateRequest;
import com.example.paymets.s.service.PaymentService;

public interface PaymentService {
    PaymentResponseDTO createPayment(PaymentCreateRequest paymentRequestDTO);
}

