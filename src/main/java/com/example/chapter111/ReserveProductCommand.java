package com.example.chapter111;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ReserveProductCommand {

    private final String productId;
    private final int quantity;
    private final String orderId;
    private final String userId;
}
