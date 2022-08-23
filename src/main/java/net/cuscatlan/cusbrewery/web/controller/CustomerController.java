package net.cuscatlan.cusbrewery.web.controller;

/*
Creado por Renato Bonilla 16/8/2022 : 17:07
*/

import net.cuscatlan.cusbrewery.services.CustomerService;
import net.cuscatlan.cusbrewery.web.model.CustomerDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping
    public ResponseEntity saveCustomer(@RequestBody CustomerDTO customerDTO){

        HttpHeaders headers = new HttpHeaders();
        CustomerDTO saved = customerService.saveCustomer(customerDTO);
        headers.add("ubicación ", saved.getCustomerId().toString());
        return new ResponseEntity("/api/v1/customer" + headers,HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity updateCustomer(@RequestBody CustomerDTO customerDTO, @PathVariable("customerId") UUID customerId){

        customerService.updateCustomerById(customerDTO,customerId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{customerId}")
    public void deleteCustomer(@PathVariable("customerId") UUID customerId){
        customerService.deleteCustomerById(customerId);
    }

}
