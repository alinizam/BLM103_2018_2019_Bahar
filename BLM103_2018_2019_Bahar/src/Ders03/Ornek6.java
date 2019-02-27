/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03;

/**
 *
 * @author alinizam
 */
public class Ornek6 {

    public static void main(String[] args) {
        int j = 5;
        int i = (10 * 3) / (j++);
        System.out.println(i);
        boolean b = 1 + 9 > 2 + 5;
        System.out.println(b);

        int k = (j = 10);
        System.out.println(k);
        boolean sonuc = (j == (k = 10));
        System.out.println(sonuc);

    }
}
