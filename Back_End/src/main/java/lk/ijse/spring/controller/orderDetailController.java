package lk.ijse.spring.controller;

import lk.ijse.spring.service.OrderService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@CrossOrigin
public class orderDetailController {
    @Autowired
    private OrderService service;

    @GetMapping
    public ResponseUtil getAllOrders() {
        return new ResponseUtil("Ok", "Success", service.getAllOrders());
    }
}
