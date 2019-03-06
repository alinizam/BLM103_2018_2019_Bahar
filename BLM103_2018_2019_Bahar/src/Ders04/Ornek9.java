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
public class Ornek9 {
public static void main(String[] args) {
        //Kullanıcıdan sayı alan ve bunları toplatan bir uygulama kodlayınız.
        //Kullanıcı -1 girerse program sonlanır.
        Scanner s=new Scanner(System.in); 
        int sayi=0;
        int toplam=0;
        do{ 
            toplam+=sayi;
            System.out.print("Bir sayı giriniz : ");
            sayi=s.nextInt();
        } while(sayi != -1);
        System.out.println("Son toplam = "+toplam);
    }    
}
