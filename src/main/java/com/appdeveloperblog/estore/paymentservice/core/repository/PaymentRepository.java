package com.appdeveloperblog.estore.paymentservice.core.repository;

import com.appdeveloperblog.estore.paymentservice.core.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, String> {

}
