package uap.mains;

import uap.models.Torus;
import uap.models.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAMA LENGKAP"); // Ganti dengan nama Anda
        System.out.println("NIM"); // Ganti dengan NIM Anda
        System.out.println("=============================================");

        Torus torus = new Torus(7, 3.5);
        torus.printInfo();

        Sphere sphere = new Sphere(21);
        sphere.printInfo();
    }
}