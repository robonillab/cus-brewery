package net.cuscatlan.cusbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/*
Creado por Renato Bonilla 16/8/2022 : 15:32
*/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDTO {

    private UUID beerId;
    private String beerName;
    private String beerType;
    private Long upc;


}
