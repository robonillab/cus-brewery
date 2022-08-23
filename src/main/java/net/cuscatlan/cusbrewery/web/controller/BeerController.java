package net.cuscatlan.cusbrewery.web.controller;

import net.cuscatlan.cusbrewery.services.BeerService;
import net.cuscatlan.cusbrewery.web.model.BeerDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<BeerDTO> getBeerById(@PathVariable("beerId")  UUID beerId){
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveBeer(@RequestBody BeerDTO beerDTO){
        BeerDTO savedBeer = beerService.saveBeer(beerDTO);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Ubicación ", savedBeer.getBeerId().toString());
        return new ResponseEntity("/api/v1/beer/" + headers,HttpStatus.CREATED);

    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeer(@RequestBody BeerDTO beerDTO, @PathVariable("beerId") UUID beerId){

        beerService.updateBeerById(beerDTO, beerId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{beerId}")
    void deleteBeer(@PathVariable("beerId") UUID beerId){

        beerService.deleteBeerById(beerId);
    }

}
