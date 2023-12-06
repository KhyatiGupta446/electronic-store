package com.lcwd.electronic.store.services;

import com.lcwd.electronic.store.dtos.CreateOrderRequest;
import com.lcwd.electronic.store.dtos.OrderDto;
import com.lcwd.electronic.store.dtos.OrderUpdateRequest;
import com.lcwd.electronic.store.dtos.PageableResponse;

import java.util.List;

public interface OrderService {

    //create Order
    OrderDto createOrder(CreateOrderRequest orderDto);

    //remove Order
    void removeOrder(String orderId);

    //get orders of user
    List<OrderDto> getOrdersOfUser(String userId);

    //get orders
    PageableResponse<OrderDto> getOrders(int pageNumber, int pageSize, String sortBy, String sortDir);

    //update Order
    OrderDto updateOrder(String orderId, OrderUpdateRequest request);

    //other methods(logic) related to order
}
