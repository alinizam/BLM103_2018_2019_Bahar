/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07Vize;

/**
 *
 * @author alinizam
 */
public class Soru4 {
    public static void main(String[] args) {
        int y = 3, x = 1;
        int i = 2;
        while (x <= y) {
            if (x > i) {
                i = i << 2;
                y = (2 * x++)-5;
            } else {
                y = 2 * ++x;
            }
            System.out.println("x: " + x + "  y: " + y + " i: " + i);
        }


    }
}
