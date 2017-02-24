/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.mmendezn.a07;
import java.util.Scanner;
/**
 *
 * @author migue
 */
public class SppMMendezNA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kb= new Scanner(System.in);
        long [] numero = new long [11];
        int telefono;
       
        
        for (int t = 1; t <numero.length; t++){
            
            System.out.println("Introduce el numero de telefono " + t);
            numero[t]= kb.nextLong(); }
            System.out.println("Introduce el numero que deseas ver (del 1 al 10)");
            telefono= kb.nextInt();
            
        if (telefono > 10) {
            System.out.println("El numero de telefono no es valido");
        
            
        }
        
        else{
            System.out.println("El telefono es "+ numero[telefono]);   
    }
    }
}
    
    
   

