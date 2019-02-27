/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03Lab;

/**
 *
 * @author alinizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        int sayi=92;
        int sonuc=1;
        if (sayi%4==0) sonuc=4; 
        else if (sayi%3==0) sonuc=3; 
        else if (sayi%2==0) sonuc=2; 
        System.out.println("Sonuç = " + sonuc);
        
    }
}
