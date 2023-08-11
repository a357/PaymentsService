package com.appdeveloperblog.estore.paymentservice.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@Entity
@Table(name = "payments")
public class PaymentEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    private String paymentId;
    @Column
    public String orderId;
}
