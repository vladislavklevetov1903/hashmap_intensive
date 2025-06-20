package com.school.faang.hashmap.задача_3;

import java.util.Objects;

public class Product {

    String productId;
    String name;

    public Product(String productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(productId);
    }

    @Override
    public boolean equals(Object obj){

        if(obj == null) return false;

        Product product = (Product) obj;
        return productId.equals(product.getProductId());
    }
}
