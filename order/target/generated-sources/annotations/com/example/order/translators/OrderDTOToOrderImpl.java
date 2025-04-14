package com.example.order.translators;

import com.example.order.entity.Deliver;
import com.example.order.entity.DeliverDTO;
import com.example.order.entity.Order;
import com.example.order.entity.OrderDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-11T16:51:49+0200",
    comments = "version: 1.5.0.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class OrderDTOToOrderImpl extends OrderDTOToOrder {

    @Override
    protected Order translate(OrderDTO orderDTO) {
        if ( orderDTO == null ) {
            return null;
        }

        Order order = new Order();

        order.setUuid( orderDTO.getUuid() );
        order.setOrders( orderDTO.getOrders() );
        order.setStatus( orderDTO.getStatus() );

        order.setFirstName( orderDTO.getCustomerDetails().getFirstName() );
        order.setLastName( orderDTO.getCustomerDetails().getLastName() );
        order.setEmail( orderDTO.getCustomerDetails().getEmail() );
        order.setPhone( orderDTO.getCustomerDetails().getPhone() );
        order.setCity( orderDTO.getAddress().getCity() );
        order.setNumber( orderDTO.getAddress().getNumber() );
        order.setStreet( orderDTO.getAddress().getStreet() );
        order.setPostCode( orderDTO.getAddress().getPostCode() );
        order.setDeliver( translate(orderDTO.getDeliver()) );

        return order;
    }

    @Override
    protected Deliver translate(DeliverDTO deliverDTO) {
        if ( deliverDTO == null ) {
            return null;
        }

        Deliver deliver = new Deliver();

        deliver.setUuid( deliverDTO.getUuid() );
        deliver.setName( deliverDTO.getName() );
        deliver.setPrice( deliverDTO.getPrice() );

        return deliver;
    }
}
