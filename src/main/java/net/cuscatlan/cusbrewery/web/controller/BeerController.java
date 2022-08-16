package net.cuscatlan.cusbrewery.web.controller;

import net.cuscatlan.cusbrewery.services.BeerService;
import net.cuscatlan.cusbrewery.web.model.BeerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/*
Creado por Renato Bonilla 16/8/2022 : 15:51
*/
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    ResponseEntity<BeerDTO> getBeerById(@PathVariable("beerId")  UUID beerId){
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }


}
