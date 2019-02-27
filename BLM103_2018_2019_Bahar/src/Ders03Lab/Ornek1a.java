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
public class Ornek1a {

    public static void main(String[] args) {
        int not = 199;
        if (not <= 100 && not >= 70) {
            System.out.println("AA");
        } else if (not < 70 && not >= 45) {
            System.out.println("CC");
        } else if (not < 45) {
            System.out.println("FF");
        } else {
            System.out.println("Geçersiz");
        }
    }
}
