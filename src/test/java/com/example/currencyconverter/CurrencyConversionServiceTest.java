package com.example.currencyconverter;

import com.example.currencyconverter.response.CurrencyApiResponse;
import com.example.currencyconverter.service.CurrencyConversionService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@SpringBootTest
public class CurrencyConversionServiceTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private CurrencyConversionService currencyConversionService;

    @Test
    public void testGetExchangeRate() {
        // Arrange
        String sourceCurrency = "INR";
        String targetCurrency = "USD";

        Map<String, Double> rates = new HashMap<>();
        rates.put("USD", 1.0);
        rates.put("EUR", 0.85);

        CurrencyApiResponse response = new CurrencyApiResponse();
        response.setRates(rates);

        when(restTemplate.getForObject(any(String.class), eq(CurrencyApiResponse.class)))
                .thenReturn(response);

        // Act
        double exchangeRate = currencyConversionService.convertCurrency(sourceCurrency, targetCurrency, 1.0);

        // Assert
        assertEquals(0.85, exchangeRate);
    }
}
