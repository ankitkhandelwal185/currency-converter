package com.example.currencyconverter.service;

public interface CurrencyConversionService {
    double convertCurrency(String sourceCurrency, String targetCurrency, double sourceAmount);
}
