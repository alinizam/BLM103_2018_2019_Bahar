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
public class Ornek1d {
    public static void main(String[] args) {
           double maas = 10000;
        int ayNo = 4;
        for (int i = 1; i <= ayNo; i++) {
            if (i<=3) maas = 1.1 * maas;
        }
        System.out.println("Maas = "+maas);
    }
}
