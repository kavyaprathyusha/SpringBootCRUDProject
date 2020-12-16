package com.sreenath.SpringBootProject.serviceImpl;

import com.sreenath.SpringBootProject.entity.ProductList;
import com.sreenath.SpringBootProject.repository.ProductRepository;
import com.sreenath.SpringBootProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductList getProduct(Long itemID) {
        Optional<ProductList> optEmp = productRepository.findById(itemID);
        return optEmp.get();
    }

    @Override
    public List<ProductList> getProducts() {
        List<ProductList> products = productRepository.findAll();
        return products;
    }

    @Override
    public void saveProduct(ProductList productList) {
        productRepository.save(productList);
    }
}
