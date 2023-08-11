package com.appdeveloperblog.estore.paymentservice.query;

import com.appdeveloperblog.estore.core.events.PaymentProcessedEvent;
import com.appdeveloperblog.estore.paymentservice.core.entity.PaymentEntity;
import com.appdeveloperblog.estore.paymentservice.core.repository.PaymentRepository;
import org.axonframework.eventhandling.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentEventHandler {

    private final Logger LOGGER = LoggerFactory.getLogger(PaymentEventHandler.class);
    private PaymentRepository repository;

    @Autowired
    public PaymentEventHandler(PaymentRepository repository) {
        this.repository = repository;
    }

    @EventHandler
    public void on(PaymentProcessedEvent event) {
        LOGGER.info("PaymentProcessedEvent is called for orderId: " + event.getOrderId());

        PaymentEntity entity = new PaymentEntity();
        BeanUtils.copyProperties(event, entity);
        repository.save(entity);
    }

}
