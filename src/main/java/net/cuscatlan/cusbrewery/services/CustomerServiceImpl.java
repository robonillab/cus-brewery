package net.cuscatlan.cusbrewery.services;

import lombok.extern.slf4j.Slf4j;
import net.cuscatlan.cusbrewery.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

/*
Creado por Renato Bonilla 16/8/2022 : 17:03
*/
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder()
                .customerId(UUID.randomUUID())
                .name("Renato Bonilla")
                .build();
    }

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        return CustomerDTO.builder()
                .customerId(UUID.randomUUID())
                .name("Renato")
                .build();
    }

    @Override
    public void updateCustomerById(CustomerDTO customerDTO, UUID customerId) {
// luego se va a implementar
    }

    @Override
    public void deleteCustomerById(UUID customerId) {

        log.info("Se ha borrado el registro de cliente :" + customerId);

    }
}
