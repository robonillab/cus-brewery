package net.cuscatlan.cusbrewery.services;

import lombok.extern.slf4j.Slf4j;
import net.cuscatlan.cusbrewery.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

/*
Creado por Renato Bonilla 16/8/2022 : 15:48
*/
@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder()
                .beerId(UUID.randomUUID())
                .beerName("Pilsener")
                .beerType("Pilsen")
                .build();
    }

    @Override
    public BeerDTO saveBeer(BeerDTO beerDTO) {
        return BeerDTO.builder()
                .beerId(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeerById(BeerDTO beerDTO, UUID beerId) {
        // Se tiene que implementar más adelante
    }

    @Override
    public void deleteBeerById(UUID beerId) {

        log.debug("Se ha borrado la beer: " + beerId);
    }
}
