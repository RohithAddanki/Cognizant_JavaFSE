package com.forecast.core;

//This is a Concrete subclass implementing recursive forecasting logic

public class RecursiveForecast extends ForecastTemplate {

    @Override
    protected double calculateForecast(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return calculateForecast(initialValue, growthRate, years - 1) * (1 + growthRate);
    }
}
