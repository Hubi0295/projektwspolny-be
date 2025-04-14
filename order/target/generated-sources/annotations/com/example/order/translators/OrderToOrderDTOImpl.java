package com.example.order.translators;

import com.example.order.entity.Address;
import com.example.order.entity.CustomerDetails;
import com.example.order.entity.Deliver;
import com.example.order.entity.DeliverDTO;
import com.example.order.entity.Order;
import com.example.order.entity.OrderDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-11T16:51:47+0200",
    comments = "version: 1.5.0.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class OrderToOrderDTOImpl extends OrderToOrderDTO {

    @Override
    protected OrderDTO translate(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setUuid( order.getUuid() );
        orderDTO.setOrders( order.getOrders() );
        orderDTO.setStatus( order.getStatus() );

        orderDTO.setCustomerDetails( translateToCustomer(order) );
        orderDTO.setAddress( translateAddres(order) );
        orderDTO.setDeliver( translateDeliver(order.getDeliver()) );

        return orderDTO;
    }

    @Override
    protected CustomerDetails translateToCustomer(Order order) {
        if ( order == null ) {
            return null;
        }

        CustomerDetails customerDetails = new CustomerDetails();

        customerDetails.setFirstName( order.getFirstName() );
        customerDetails.setLastName( order.getLastName() );
        customerDetails.setPhone( order.getPhone() );
        customerDetails.setEmail( order.getEmail() );

        return customerDetails;
    }

    @Override
    protected Address translateAddres(Order order) {
        if ( order == null ) {
            return null;
        }

        Address address = new Address();

        address.setCity( order.getCity() );
        address.setStreet( order.getStreet() );
        address.setNumber( order.getNumber() );
        address.setPostCode( order.getPostCode() );

        return address;
    }

    @Override
    protected DeliverDTO translateDeliver(Deliver deliver) {
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
