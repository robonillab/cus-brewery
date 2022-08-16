package net.cuscatlan.cusbrewery.services;

import net.cuscatlan.cusbrewery.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

/*
Creado por Renato Bonilla 16/8/2022 : 17:03
*/
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder()
                .customerId(UUID.randomUUID())
                .name("Renato Bonilla")
                .build();
    }
}
