/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

/**
 *
 * @author alinizam
 */
public class Ornek2 {

    public static void main(String[] args) {
        int x = 1;
        int y = 3;
        while (x < y) {
            x = 3 * (x++);
            if (x < 10) {
                System.out.println("x: " + x + "  y: " + y);
                y = y << 1;
            }
            y = --y;
        }
        System.out.println("x: " + x + "  y: " + y);

    }
}
