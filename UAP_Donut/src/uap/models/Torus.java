package uap.models;

import uap.bases.Shape;

public class Torus extends Shape {
    private double majorRadius;
    private double minorRadius;

    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double calculateVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius;
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius;
    }

    @Override
    public void printInfo() {
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.println("Isikan Radius   : " + majorRadius);
        System.out.println("Isikan radius   : " + minorRadius);
        System.out.println("=============================================");
        System.out.println("Volume          : " + String.format("%.2f", calculateVolume()) + " cm^3");
        System.out.println("Luas permukaan  : " + String.format("%.2f", calculateSurfaceArea()) + " cm^2");
        System.out.println("Massa           : " + String.format("%.2f", calculateMass()) + " g");
        System.out.println("Massa dalam kg  : " + String.format("%.2f", convertToKg(calculateMass())) + " kg");
        System.out.println("Biaya kirim     : " + formatRupiah(calculateShippingCost()));
        System.out.println("=============================================");
    }
}