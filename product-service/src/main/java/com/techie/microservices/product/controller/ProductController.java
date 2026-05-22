package com.techie.microservices.product.controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.ServerRequest.Headers;

import com.techie.microservices.product.dto.ProductRequest;
import com.techie.microservices.product.model.Product;
import com.techie.microservices.product.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
	
	private final ProductService productService;
	
	@PostMapping
	//@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Product> createProduct(@RequestBody ProductRequest productRequest) {
		
		Product savedProduct = productService.createProduct(productRequest);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Location", "/product/"+savedProduct.getId());
		
		return new ResponseEntity<>(savedProduct, headers, HttpStatus.CREATED);
		
	}
	
	@GetMapping
	public List<Product> getAllProducts(){
		
	}

}
