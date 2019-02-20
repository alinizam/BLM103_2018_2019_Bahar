/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02Lab;

/**
 *
 * @author alinizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        int sayi=35;
        int birler=sayi%10;
        int onlar=sayi/10;
        int yeniSayi=(birler*10)+onlar;
        System.out.println(yeniSayi);
    }
}
