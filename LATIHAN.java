/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class LATIHAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int a,b,c;
  Scanner nilai = new Scanner (System.in);
     System.out.print("Masukkan Sisi 1:");
     a=nilai.nextInt();
     System.out.print("Masukkan Sisi 2:");
     b=nilai.nextInt();
     System.out.print("Masukkan Sisi 3:");
     c = nilai.nextInt();
    
     if ((a == 0) || (b == 0)|| (c == 0)){
       System.out.println ("Bukan segitiga");
         
     }else{
         if((a == b)&&(c == a))
             System.out.println("segitiga sama sisi");
     }if((a ==b) ||(a == c) ||(b ==c))
         System.out.println("segitiga sama kaki");
     else
        System.out.println("segita sembarang");
     
         
     
     
     
     
    }
    
}
