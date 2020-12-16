package com.sreenath.SpringBootProject.controller;

import com.sreenath.SpringBootProject.entity.ProductList;
import com.sreenath.SpringBootProject.service.ExchangeService;
import com.sreenath.SpringBootProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private ExchangeService exchangeService;

    public void setProductService(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/api/products")
    public List<ProductList> getProduct() {
        List<ProductList> products = productService.getProducts();
        return products;
    }

    @GetMapping("/api/products/{itemID}")
    public ProductList getEmployee(@PathVariable(name="itemID")Long itemID) {
        return productService.getProduct(itemID);
    }
    @PostMapping("/api/products")
    public void saveEmployee(ProductList productList){
        productService.saveProduct(productList);
        System.out.println("Product Saved Successfully");
    }
    @GetMapping("/api/conversion/{itemID}/{currencyAlpha}")
    public Double getConversion(@PathVariable(name="itemID")Long itemID,@PathVariable(name="currencyAlpha")String currencyAlpha){
        Integer itemCostUSD=productService.getProduct(itemID).getItemCost();
        Double conversionRate= exchangeService.getCurrencyValue(currencyAlpha);
        Double itemCostConverted= itemCostUSD * conversionRate;
        System.out.println(itemCostUSD+ " "+ conversionRate);
        return itemCostConverted;
    }
}
