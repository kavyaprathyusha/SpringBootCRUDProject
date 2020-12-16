package com.sreenath.SpringBootProject.service;

import com.sreenath.SpringBootProject.entity.ProductList;

import java.util.List;

public interface ProductService {
    ProductList getProduct(Long itemID);

    List<ProductList> getProducts();

    void saveProduct(ProductList productList);
}
