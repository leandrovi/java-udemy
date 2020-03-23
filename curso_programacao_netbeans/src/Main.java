import java.util.Locale;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leandro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Numbers operations
//        double x = 10.35784;
//                
//        System.out.println(x);
//        System.out.printf("%.2f\n", x);
//        System.out.printf("%.4f\n", x);
        
        // Set locale formatting
//        Locale.setDefault(Locale.US);
//        System.out.printf("%.4f\n", x);
        
        // Strings concat
//        System.out.println("RESULTADO = " + x + " METROS");
//        System.out.printf("RESULTADO = %.2f metros%n", x);
//        
//        String nome = "Maria";
//        int idade = 31;
//        double renda = 4000.46;
//        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
//        
//        System.out.println("");        
//        System.out.println("");
        
        // Exercise
//        String product1 = "Computer";
//        String product2 = "Office desk";
//        
//        int age = 30;
//        int code = 5290;
//        char gender = 'F';
//        
//        double price1 = 2100.0;
//        double price2 = 650.0;
//        double measure = 53.234567;
//        
//        System.out.println("Products:");
//        System.out.printf("%s, which price is $ %.2f%n", product1, price1);        
//        System.out.printf("%s, which price is $ %.2f%n", product2, price2);
//        
//        System.out.println("");
//        
//        System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
//        
//        System.out.println("");
//        
//        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
//        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
//        
//        Locale.setDefault(Locale.US);
//        System.out.printf("US decimal point: %.3f%n", measure);

        // Scanner
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
          
//        String x;
//        x = sc.next();
//        System.out.println("Você digitou: " + x);
          
//        int x;
//        x = sc.nextInt();
//        System.out.println("Você digitou: " + x);

//        double x;
//        x = sc.nextDouble();
//        System.out.printf("Você digitou: %.2f%n", x);
        
        char x;
        x = sc.next().charAt(0);
        System.out.println("Você digitou: "+ x);
          
        sc.close();
    }
    
}
