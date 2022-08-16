package net.cuscatlan.cusbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/*
Creado por Renato Bonilla 16/8/2022 : 16:59
*/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDTO {

    private UUID customerId;
    private String name;
}
