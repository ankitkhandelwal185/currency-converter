package com.example.currencyconverter.service.impl;

import com.example.currencyconverter.service.CurrencyConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyConversionServiceImpl implements CurrencyConversionService {

    @Autowired
    private CurrencyConversionApiService currencyConversionApiService;

    public double convertCurrency(String sourceCurrency, String targetCurrency, double sourceAmount) {
        double exchangeRate = currencyConversionApiService.getExchangeRate(sourceCurrency, targetCurrency);
        return sourceAmount * exchangeRate;
    }
}
