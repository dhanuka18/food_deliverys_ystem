package com.example.paymets.s.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@ApiModel(value = "PaymentRequestDTO", description = "Parameters required for a payment")
public class PaymentCreateRequest {

    @ApiModelProperty(notes = "Name of the payment", required = true)
    @NotBlank(message = "Name is required")
    @Size(max = 255)
    private String name;

    @ApiModelProperty(notes = "Number of the payment")
    private String number;

    @ApiModelProperty(notes = "Email of the payment")
    private String email;

    @ApiModelProperty(notes = "Address of the payment")
    private String address;

    @ApiModelProperty(notes = "Bill value of the payment")
    private int billValue;

    @ApiModelProperty(notes = "Card number of the payment")
    private String cardNumber;

    @ApiModelProperty(notes = "Card holder of the payment")
    private String cardHolder;

    @ApiModelProperty(notes = "Date value of the payment")
    private String dateValue;

    @ApiModelProperty(notes = "CVC of the payment")
    private String cvc;
}
