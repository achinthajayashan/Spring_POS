package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.OrdersDTO;
import lk.ijse.spring.entity.Orders;
import lk.ijse.spring.repo.OrdersRepo;
import lk.ijse.spring.service.OrderService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ModelMapper mapper;

    @Autowired
    private OrdersRepo repo;

    @Override
    public List<OrdersDTO> getAllOrders() {
        List<Orders> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<OrdersDTO>>() {
        }.getType());
    }
}
