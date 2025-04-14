package com.example.order.translators;

import com.example.order.entity.Items;
import com.example.order.entity.OrderItems;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-11T16:51:50+0200",
    comments = "version: 1.5.0.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class OrderItemsToItemsImpl extends OrderItemsToItems {

    @Override
    protected Items translate(OrderItems orderItems) {
        if ( orderItems == null ) {
            return null;
        }

        Items items = new Items();

        items.setPrice( orderItems.getPriceUnit() );
        items.setSummaryPrice( orderItems.getPriceSummary() );
        items.setUuid( orderItems.getUuid() );
        items.setName( orderItems.getName() );
        items.setQuantity( orderItems.getQuantity() );

        return items;
    }
}
