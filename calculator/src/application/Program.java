/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author leandro
 */
public class Program {
    
    public static final double PI = 3.14159;
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        
        double c = circumference(radius);
        
        double v = volume(radius);
        
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);
        
        sc.close();
        
    }
    
    public static double circumference(double radius) {
        return 2 * PI * radius;
    }
    
    public static double volume(double radius) {
        return 4 * PI * radius * radius * radius / 3.0;
    }
}
