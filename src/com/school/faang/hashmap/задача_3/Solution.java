package com.school.faang.hashmap.задача_3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

        Map<Product, Integer> cart = new HashMap<Product, Integer>();

        Product product1 = new Product("1", "Смартфон");
        Product product2 = new Product("2", "Телевизор");
        Product product3 = new Product("1", "Смартфон");

        Solution solution = new Solution();
        solution.addProduct(cart, product1);
        solution.addProduct(cart, product2);
        solution.addProduct(cart, product3);

        for (Map.Entry<Product, Integer> entry : cart.entrySet()){
            Product product = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Корзина содержит: '" + product.name + "' в количестве: " + value);
        }
    }

    public void addProduct(Map<Product, Integer> cart,  Product product){
        if(cart.containsKey(product)){
            cart.put(product, cart.get(product) + 1);
        } else {
            cart.put(product, 1);
        }
    }
}
