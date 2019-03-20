/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04Lab;

/**
 *
 * @author alinizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        for (int i = 9; i > 0; i--) {
            for (int j = 0; j < 10; j++) {
                if (9-i<j)
                    System.out.print(i+" ");
                else
                    System.out.print("_ ");
            }
            System.out.println("");
        }
    }
}
