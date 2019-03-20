/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06Lab;

/**
 *
 * @author alinizam
 */
public class Ornek1b {

    public static void main(String[] args) {
        char c1 = 'A', c2 = '/';
        if (!((c1 >= 65 && c1 <= 90) || (c1 >= 97 && c1 <= 122))) {
            System.out.println("Hatalı");
            return;
        }
        if (!((c2 >= 65 && c2 <= 89) || (c2 >= 97 && c2 <= 122))) {
            System.out.println("Hatalı");
            return;
        }
        if (c1 > c2) {
            System.out.println(c1);
        } else {
            System.out.println(c2);
        }
    }
}
