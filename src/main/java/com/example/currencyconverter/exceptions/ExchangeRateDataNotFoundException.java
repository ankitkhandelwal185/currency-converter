package com.example.currencyconverter.exceptions;

public class ExchangeRateDataNotFoundException extends RuntimeException {

    public ExchangeRateDataNotFoundException(String message) {
        super(message);
    }
}
