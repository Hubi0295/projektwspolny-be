package com.example.order.translators;

import com.example.order.entity.BasketItemDTO;
import com.example.order.entity.OrderItems;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-11T16:51:50+0200",
    comments = "version: 1.5.0.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class BasketItemDTOToOrderItemsImpl extends BasketItemDTOToOrderItems {

    @Override
    protected OrderItems translate(BasketItemDTO basketItemDTO) {
        if ( basketItemDTO == null ) {
            return null;
        }

        OrderItems orderItems = new OrderItems();

        orderItems.setProduct( basketItemDTO.getUuid() );
        orderItems.setPriceUnit( basketItemDTO.getPrice() );
        orderItems.setPriceSummary( basketItemDTO.getSummaryPrice() );
        orderItems.setUuid( basketItemDTO.getUuid() );
        orderItems.setName( basketItemDTO.getName() );
        orderItems.setQuantity( basketItemDTO.getQuantity() );

        return orderItems;
    }
}
