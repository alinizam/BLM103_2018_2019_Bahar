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
public class Ornek4 {

    public static void main(String[] args) {
        int x = 0b101;
        int y = 3; //011
        if ((x | y) > 0) {
            y = y << 1;
            x = --x + x++;
            System.out.println("x : " + x + "   y :" + y);
        }
        System.out.println("x : " + x + "   y :" + y);
    }
}
