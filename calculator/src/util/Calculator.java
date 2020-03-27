/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author leandro
 */
public class Calculator {
    
    public static final double PI = 3.14159;
    
    public static double circumference(double radius) {
        return 2 * PI * radius;
    }
    
    public static double volume(double radius) {
        return 4 * PI * radius * radius * radius / 3.0;
    }
}
