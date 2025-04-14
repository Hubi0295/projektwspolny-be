package com.example.order.translators;

import com.example.order.entity.Deliver;
import com.example.order.entity.DeliverDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-11T16:51:44+0200",
    comments = "version: 1.5.0.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class DeliverToDeliverDTOImpl extends DeliverToDeliverDTO {

    @Override
    protected DeliverDTO translate(Deliver deliver) {
        if ( deliver == null ) {
            return null;
        }

        DeliverDTO deliverDTO = new DeliverDTO();

        deliverDTO.setUuid( deliver.getUuid() );
        deliverDTO.setName( deliver.getName() );
        deliverDTO.setPrice( deliver.getPrice() );

        return deliverDTO;
    }
}
