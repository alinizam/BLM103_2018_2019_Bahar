/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02;

/**
 *
 * @author alinizam
 */
public class Ornek19 {

    public static void main(String[] args) {
        int sonuc;
        int x = 1;
        sonuc = 2 * (x++) + x++;
        System.out.println("x = " + x);
        System.out.println("sonuç = " + sonuc);
    }

}
