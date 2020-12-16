package com.sreenath.SpringBootProject.repository;

import com.sreenath.SpringBootProject.entity.ExchangeRate;
import com.sreenath.SpringBootProject.entity.ProductList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversionRepository extends JpaRepository<ExchangeRate,String> {
}
