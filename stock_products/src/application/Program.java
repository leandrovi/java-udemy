/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author leandro
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Product product = new Product();
        
        System.out.println("Enter product data:");
        
        System.out.print("Name: ");
        product.name = sc.nextLine();
        
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        
        System.out.print("Quantity in sotck: ");
        product.quantity = sc.nextInt();
        
        System.out.println();
        System.out.println("Product data: " + product);
        
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);
        
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);
        
        sc.close();
    }
}
