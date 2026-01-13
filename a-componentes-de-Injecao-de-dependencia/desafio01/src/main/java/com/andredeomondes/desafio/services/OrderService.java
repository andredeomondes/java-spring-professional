package main.java.com.andredeomondes.desafio.services;

import main.java.com.andredeomondes.desafio.entitites.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        return order.getBasic() - order.getBasic()/100 * order.getDiscount() - shippingService.shipment(order);
    }


}
