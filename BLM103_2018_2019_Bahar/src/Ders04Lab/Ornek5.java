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
public class Ornek5 {

    public static void main(String[] args) {
        int toplam = 0;
        int i = 0;
        while (toplam  <= 3000) {
            i++;
            toplam += i;
        }
        System.out.println(i + "'inci elemanda " + " toplam =" + toplam);
    }
}
