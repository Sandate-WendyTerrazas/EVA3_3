/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_18_temperaturas;

/**
 *
 * @author wendy
 */
public class EVA3_18_TEMPERATURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double celsius = 25;
        System.out.println("Celsius a Fahrenheit: " + celsiusAFahrenheit(celsius));
        System.out.println("Celsius a Kelvin: " + celsiusAKelvin(celsius));

        double fahrenheit = 77;
        System.out.println("Fahrenheit a Celsius: " + fahrenheitACelsius(fahrenheit));
        System.out.println("Fahrenheit a Kelvin: " + fahrenheitAKelvin(fahrenheit));

        double kelvin = 298;
        System.out.println("Kelvin a Fahrenheit: " + kelvinAFahrenheit(kelvin));
    }
    // Convertir Celsius a Fahrenheit
    public static double celsiusAFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    // Convertir Celsius a Kelvin
    public static double celsiusAKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Convertir Fahrenheit a Celsius
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convertir Kelvin a Fahrenheit
    public static double kelvinAFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    // Convertir Fahrenheit a Kelvin
    public static double fahrenheitAKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }
}
