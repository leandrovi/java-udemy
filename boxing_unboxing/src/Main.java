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
        
        int x = 200;
        
        Object obj = x;
        
        System.out.println(obj);
        
        int y = (int) obj;
        
        System.out.println(y);
        
        // Wrapper classes        
        int a = 300;
        
        Integer obj2 = a;
        
        System.out.println(obj2);
        
        int b = obj2;
        
        System.out.println(b);
        
    }
    
}
