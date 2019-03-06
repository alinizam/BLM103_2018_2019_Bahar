/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04;

import java.util.Scanner;

/**
 *
 * @author alinizam
 */
public class Ornek8 {
    public static void main(String[] args) {
        //Kullanıcıdan sayı alan ve bunları toplatan bir uygulama kodlayınız.
        //Kullanıcı -1 girerse program sonlanır.
        Scanner s=new Scanner(System.in); 
        System.out.print("Bir sayı giriniz : ");
        int sayi=s.nextInt();
        int toplam=0;
        while(sayi != -1){
            toplam+=sayi;
            System.out.println("Toplam = "+toplam);
            System.out.print("Bir sayı daha giriniz : ");
            sayi=s.nextInt();
        }
        System.out.println("Son toplam = "+toplam);
    }
    
}
