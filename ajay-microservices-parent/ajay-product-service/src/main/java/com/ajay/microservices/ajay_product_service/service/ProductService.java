package com.ajay.microservices.ajay_product_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ajay.microservices.ajay_product_service.dto.ProductRequest;
import com.ajay.microservices.ajay_product_service.dto.ProductResponse;
import com.ajay.microservices.ajay_product_service.model.Product;
import com.ajay.microservices.ajay_product_service.repository.ProductoryRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
	
	
	private final ProductoryRepository productoryRepository;
	
	public void createProduct(ProductRequest productRequest) {
		Product product = Product.builder()
							.name(productRequest.getName())
							.description(productRequest.getDescription())
							.price(productRequest.getPrice())
							.build();
		productoryRepository.save(product);
		log.info("Product {} saved", product.getId());
		
		
	}
	
	public List<ProductResponse> getAllProducts(){
		
		List<Product> products = productoryRepository.findAll();
		
		//return products.stream().map(product -> mapToProductResponse(product)).toList();  or
		return products.stream().map(this::mapToProductResponse).toList();
		
		
	}
	
	public ProductResponse mapToProductResponse(Product product) {
		
		return ProductResponse.builder()
				.id(product.getId())
				.name(product.getName())
				.description(product.getDescription())
				.price(product.getPrice())				
				.build();
		
	}

}
