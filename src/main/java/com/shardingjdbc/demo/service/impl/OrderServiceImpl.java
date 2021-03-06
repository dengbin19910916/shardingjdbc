package com.shardingjdbc.demo.service.impl;

import com.shardingjdbc.demo.pojo.Order;
import com.shardingjdbc.demo.mapper.OrderMapper;
import com.shardingjdbc.demo.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    //列出所有订单
    @Override
    public List<Order> getAllOrder() {
        List<Order> order_list = orderMapper.selectAllOrder();
        return order_list;
    }

    //添加订单
    @Override
    public boolean addOneOrder(Order orderOne) {
        int num = orderMapper.insertOneOrder(orderOne);
        if (num == 1) {
            return true;
        } else {
            return false;
        }
    }

}
