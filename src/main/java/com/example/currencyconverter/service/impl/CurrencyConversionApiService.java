package com.example.currencyconverter.service.impl;

import com.example.currencyconverter.response.CurrencyApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class CurrencyConversionApiService {

    private final String API_BASE_URL = "https://api.exchangerate-api.com/v4/latest/";

    public double getExchangeRate(String sourceCurrency, String targetCurrency) {

        try {
            String apiUrl = API_BASE_URL + sourceCurrency;
            RestTemplate restTemplate = new RestTemplate();
            CurrencyApiResponse response = restTemplate.getForObject(apiUrl, CurrencyApiResponse.class);

            if(response == null){
                throw new RuntimeException("failed");
            }
            // return rate
            return response.getRates().get(targetCurrency);
        } catch (Exception e){
            throw new RuntimeException("Exception occurred while calling exchange api, "+e.getMessage());
        }
    }
}
