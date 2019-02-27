/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03Lab;

/**
 *
 * @author alinizam
 */
public class Ornek3a {
     public static void main(String[] args) {
        int a = 156;
        int birler = a % 10;
        a -= birler;
        if (birler >= 5) {
            //a=a-birler
            a += 10;
        } 

        System.out.println(a);

    }
}
