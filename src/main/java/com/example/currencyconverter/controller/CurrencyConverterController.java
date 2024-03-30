package com.example.currencyconverter.controller;

import com.example.currencyconverter.service.CurrencyConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CurrencyConverterController {

    @Autowired
    CurrencyConversionService currencyConversionService;

    @GetMapping("/convert")
    public double convertADoubleCurrency(
            @RequestParam String sourceCurrency,
            @RequestParam String targetCurrency,
            @RequestParam double sourceAmount
    ) {
        return currencyConversionService.convertCurrency(sourceCurrency, targetCurrency, sourceAmount);
    }
}
