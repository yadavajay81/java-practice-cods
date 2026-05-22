package javatest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaStreamExample {

	public static void main(String args[]) {
		List<Product> productsList = new ArrayList<>();
		  //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
        
        productsList.stream()
        .filter(p->p.price>20000)
        .map(pm->pm.price)
        .forEach(System.out::println);
        
        
        List<Float> proPrice = productsList.stream()
        		.filter(p -> p.price > 3000)
        		.map(pm -> pm.price)
        		.collect(Collectors.toList());
        System.out.println(proPrice);
	}
}

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  