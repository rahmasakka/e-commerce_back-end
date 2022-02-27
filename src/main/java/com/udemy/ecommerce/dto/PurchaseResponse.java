package com.udemy.ecommerce.dto;

import lombok.Data;

@Data
// use this class to send back a Java object as JSON
public class PurchaseResponse {

    private final String orderTrackingNumber;

}