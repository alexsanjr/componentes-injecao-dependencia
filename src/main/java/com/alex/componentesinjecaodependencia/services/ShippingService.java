package com.alex.componentesinjecaodependencia.services;

import com.alex.componentesinjecaodependencia.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        if (order.getBasic() < 100.0) {
            return 20.0;
        } else if (order.getBasic() >= 100 && order.getBasic() < 200.0) {
            return 12.0;
        } else {
            return 0.0;
        }
    }
}
