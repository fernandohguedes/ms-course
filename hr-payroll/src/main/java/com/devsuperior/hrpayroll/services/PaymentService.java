package com.devsuperior.hrpayroll.services;

import com.devsuperior.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPament(Long workerId, int days) {
        return new Payment("Bob", 100.00, days);
    }

}
