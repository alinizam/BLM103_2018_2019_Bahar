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
public class Ornek4 {
    public static void main(String[] args) {
        int satirBasi=1;
        for (int i = 0; i < 6; i++) {
            for (int j = satirBasi; j >= satirBasi/2; j=j-2) {
                System.out.print(j+" ");
            }
            System.out.println();
            satirBasi=satirBasi*2;
        }
    }
}
