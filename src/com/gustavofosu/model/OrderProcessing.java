/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gustavofosu.model;

/**
 *
 * @author Honor
 */
public class OrderProcessing {

    private final double unitPriceFriedChicken;
    private final double unitPriceFriedEggChicken;
    private final double unitPriceFriesChicken;
    private final double unitPriceJollofChicken;
    private final double unitPriceJollofEggChicken;
    private final double deliveryFee;

    public OrderProcessing() {
        this.unitPriceFriedChicken = 10.00;
        this.unitPriceFriedEggChicken = 15.00;
        this.unitPriceFriesChicken = 15.00;
        this.unitPriceJollofEggChicken = 15.00;
        this.unitPriceJollofChicken = 10.00;
        this.deliveryFee = 5.00;
    }

    public double getUnitPriceFriedChicken() {
        return unitPriceFriedChicken;
    }

    public double getUnitPriceFriedEggChicken() {
        return unitPriceFriedEggChicken;
    }

    public double getUnitPriceFriesChicken() {
        return unitPriceFriesChicken;
    }

    public double getUnitPriceJollofChicken() {
        return unitPriceJollofChicken;
    }

    public double getUnitPriceJollofEggChicken() {
        return unitPriceJollofEggChicken;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

}
