package com.sreenath.SpringBootProject.serviceImpl;

import com.sreenath.SpringBootProject.entity.ExchangeRate;
import com.sreenath.SpringBootProject.entity.ProductList;
import com.sreenath.SpringBootProject.repository.ConversionRepository;
import com.sreenath.SpringBootProject.repository.ProductRepository;
import com.sreenath.SpringBootProject.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExchangeServiceImpl implements ExchangeService {
    @Autowired
    private ConversionRepository conversionRepository;

    public void setConversionRepository(ConversionRepository conversionRepository) {
        this.conversionRepository = conversionRepository;
    }

    @Override
    public Double getCurrencyValue(String currencyAlpha) {
        Optional<ExchangeRate> currencyValue = conversionRepository.findById(currencyAlpha);
        return currencyValue.get().getCurrencyValue();
    }
}
