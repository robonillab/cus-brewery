package net.cuscatlan.cusbrewery.services;

import net.cuscatlan.cusbrewery.web.model.CustomerDTO;

import java.util.UUID;

/*
Creado por Renato Bonilla 16/8/2022 : 17:01
*/
public interface CustomerService {

    CustomerDTO getCustomerById(UUID customerId);
    CustomerDTO saveCustomer(CustomerDTO customerDTO);

    void updateCustomerById(CustomerDTO customerDTO, UUID customerId);

    void deleteCustomerById(UUID customerId);

}
