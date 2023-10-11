package lk.ijse.spring.service;

import lk.ijse.spring.dto.OrdersDTO;

import java.util.List;

public interface OrderService {
    List<OrdersDTO> getAllOrders();
}
