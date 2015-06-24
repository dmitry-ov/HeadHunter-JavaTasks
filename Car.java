package com.company;


class Car {
    private final int amortization;
    private final int amortization_constant;
    private final int repair;

    public int getAmortization() {
        return amortization;
    }

    public int getAmortizationConstant() {
        return amortization_constant;
    }

    public int getRepair() {
        return repair;
    }

    public Car(int amortization, int amortization_constant, int repair) {
        this.amortization = amortization;
        this.amortization_constant = amortization_constant;
        this.repair = repair;
    }
}