package com.example.paymets.s.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentResponseDTO {

    private Long id;
    private String paymentStatus;
    private BigDecimal amount;
    private LocalDateTime timestamp;

    // Default constructor
    public PaymentResponseDTO() {
    }

    // Constructor with fields
    public PaymentResponseDTO(Long id, String paymentStatus, BigDecimal amount, LocalDateTime timestamp) {
        this.id = id;
        this.paymentStatus = paymentStatus;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

}
