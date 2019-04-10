/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

/**
 *
 * @author alinizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        int sayilar[] = {1, 5, 6, 8, 9};
        int i=0;
        for (int sayi:sayilar) {
             sayilar[i]+=1;
             i++;
        }
        for (int sayi : sayilar) {
            System.out.println(sayi);
        }
 
         
    }
}
