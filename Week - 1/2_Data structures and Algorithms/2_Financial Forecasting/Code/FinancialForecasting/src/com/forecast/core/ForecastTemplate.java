package com.forecast.core;

//This is an Abstract class defining the template method for forecasting

import com.forecast.model.ForecastRequest;

public abstract class ForecastTemplate {

    // Template Method
    public final double runForecast(ForecastRequest request) {
        validateInput(request);
        return calculateForecast(request.getInitialValue(), request.getGrowthRate(), request.getYears());
    }

    protected void validateInput(ForecastRequest request) {
        if (request.getYears() < 0 || request.getGrowthRate() < -1) {
            throw new IllegalArgumentException("Invalid input: years or growth rate.");
        }
    }

    // Abstract: to be implemented by subclass
    protected abstract double calculateForecast(double initialValue, double growthRate, int years);
}
