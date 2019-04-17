/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek2;

/**
 *
 * @author alinizam
 */
public class Ornek2 {

    public static void main(String[] args) {
        String s = "Fatih Sultan Mehmet eeeeee aaa";
        int harfSayi[] = new int[128];
        for (int i = 0; i < s.length(); i++) {
            harfSayi[(int) s.charAt(i)]++;
        }
        for (int i = 0; i < 128; i++) {
            if (harfSayi[i] > 0) {
                System.out.println(i+" "+(char) i + " " + harfSayi[i]);
            }
        }

    }
}
