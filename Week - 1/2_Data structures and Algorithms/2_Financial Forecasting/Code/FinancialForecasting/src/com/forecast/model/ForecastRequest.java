package com.forecast.model;

//This class Holds input data: initial value, growth rate, years to forecast

public class ForecastRequest {
    private double initialValue;
    private double growthRate;
    private int years;

    public ForecastRequest(double initialValue, double growthRate, int years) {
        this.initialValue = initialValue;
        this.growthRate = growthRate;
        this.years = years;
    }

    public double getInitialValue() {
        return initialValue;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public int getYears() {
        return years;
    }
}
