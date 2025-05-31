package uap.models;

import uap.bases.Shape;

public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * PI * radius * radius * radius;
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * PI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.println("Isikan radius   : " + radius);
        System.out.println("=============================================");
        System.out.println("Volume          : " + String.format("%.2f", calculateVolume()) + " cm^3");
        System.out.println("Luas permukaan  : " + String.format("%.2f", calculateSurfaceArea()) + " cm^2");
        System.out.println("Massa           : " + String.format("%.2f", calculateMass()) + " g");
        System.out.println("Massa dalam kg  : " + String.format("%.2f", convertToKg(calculateMass())) + " kg");
        System.out.println("Biaya kirim     : " + formatRupiah(calculateShippingCost()));
        System.out.println("=============================================");
    }
}