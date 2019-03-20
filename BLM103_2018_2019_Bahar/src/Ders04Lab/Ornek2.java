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
public class Ornek2 {
    public static void main(String[] args) {
        System.out.println("ikinin katları");
        for (int i = 1; i <= 20; i++) {
            if(i%2==0)
                System.out.println(i+" ");
        }
        System.out.println("7'nin katları");
        for (int i = 1; i <= 200; i++) {
            if(i%7==0)
                System.out.println(i+" ");
        }
    }
}
