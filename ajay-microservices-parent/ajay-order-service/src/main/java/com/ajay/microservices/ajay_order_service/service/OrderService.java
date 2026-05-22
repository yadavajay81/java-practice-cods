package com.ajay.microservices.ajay_order_service.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ajay.microservices.ajay_order_service.dto.OrderLineItemsDto;
import com.ajay.microservices.ajay_order_service.dto.OrderRequest;
import com.ajay.microservices.ajay_order_service.model.Order;
import com.ajay.microservices.ajay_order_service.model.OrderLineItems;
import com.ajay.microservices.ajay_order_service.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {
	
	
	private final OrderRepository orderRepository;
	
	
	public void placeOrder(OrderRequest orderRequest) {
		
		Order order = new Order();
		
		order.setOrderNumber(UUID.randomUUID().toString());
		
		//orderRequest.getOrderLineItemsDto().stream()
		//	.map(orderLineItemsDto -> mapToDto(orderLineItemsDto)).toList();
		
		List<OrderLineItems> orderLineItems = orderRequest.getOrderLineItemsDto().stream()
		.map(this::mapToDto).toList();
		
		order.setOrderLineItemsList(orderLineItems);
		
		orderRepository.save(order);
		
	}
	
	private OrderLineItems mapToDto(OrderLineItemsDto orderLineItemsDto) {
		OrderLineItems orderLineItems = new OrderLineItems();
		
		orderLineItems.setPrice(orderLineItemsDto.getPrice());
		orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
		orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
		
		
		return orderLineItems;
	}

}
