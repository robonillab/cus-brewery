package net.cuscatlan.cusbrewery.services;

import net.cuscatlan.cusbrewery.web.model.BeerDTO;

import java.util.UUID;

/*
Creado por Renato Bonilla 16/8/2022 : 15:45
*/
public interface BeerService {

    BeerDTO getBeerById(UUID beerId);

    BeerDTO saveBeer(BeerDTO beerDTO);

    void updateBeerById(BeerDTO beerDTO, UUID beerId);

    void deleteBeerById(UUID beerId);


}
