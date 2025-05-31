package uap.bases;

import uap.interfaces.Calculable;

public abstract class Shape implements Calculable {
    protected double density = 7.85; // Densitas stainless steel 304 dalam g/cm³
    protected static final double PI = 22.0 / 7.0;
    protected static final double SHIPPING_COST_PER_KG = 15000;

    protected double calculateMass() {
        return calculateVolume() * density;
    }

    protected double convertToKg(double mass) {
        return mass / 1000;
    }

    protected double calculateShippingCost() {
        return Math.ceil(convertToKg(calculateMass())) * SHIPPING_COST_PER_KG;
    }

    protected String formatRupiah(double amount) {
        return String.format("Rp%,.0f", amount);
    }
}