package com.example.currencyconverter.constants;

public enum Currency {
    INR("Indian Rupee"),
    USD("US Dollars"),
    EUR("Euro"),
    JPY("Japanese Yen");

    Currency(String label) {
        this.label = label;
    }

    private String label;
}
