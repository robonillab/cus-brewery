package net.cuscatlan.cusbrewery.web.controller;

/*
Creado por Renato Bonilla 16/8/2022 : 17:07
*/

import net.cuscatlan.cusbrewery.services.CustomerService;
import net.cuscatlan.cusbrewery.web.model.CustomerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    ResponseEntity<CustomerDTO> getCustomer(@PathVariable("customerId") UUID customerId){
     return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }
}
