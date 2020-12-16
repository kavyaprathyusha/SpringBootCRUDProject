package com.sreenath.SpringBootProject.entity;

import javax.persistence.*;

@Entity
@Table(name="EXRATE")
public class ExchangeRate {

    @Id
    @Column(name="CURRENCY_ALPHA")
    private String currencyAlpha;

    @Column(name="CURRENCY_VALUE")
    private Double currencyValue;
    public String getCurrencyAlpha() {
        return currencyAlpha;
    }

    public void setCurrencyAlpha(String currencyAlpha) {
        this.currencyAlpha = currencyAlpha;
    }

    public Double getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(Double currencyValue) {
        this.currencyValue = currencyValue;
    }




}
