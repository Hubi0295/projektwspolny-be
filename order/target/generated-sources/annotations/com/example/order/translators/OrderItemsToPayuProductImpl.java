package com.example.order.translators;

import com.example.order.entity.OrderItems;
import com.example.order.entity.PayuProduct;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-11T16:51:50+0200",
    comments = "version: 1.5.0.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class OrderItemsToPayuProductImpl extends OrderItemsToPayuProduct {

    @Override
    protected PayuProduct translate(OrderItems orderItems) {
        if ( orderItems == null ) {
            return null;
        }

        PayuProduct payuProduct = new PayuProduct();

        payuProduct.setUnitPrice( (long) orderItems.getPriceUnit() );
        payuProduct.setName( orderItems.getName() );
        payuProduct.setQuantity( orderItems.getQuantity() );

        return payuProduct;
    }
}
