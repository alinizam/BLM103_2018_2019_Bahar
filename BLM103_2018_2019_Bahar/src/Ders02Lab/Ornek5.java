/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders02Lab;

/**
 *
 * @author alinizam
 */
public class Ornek5 {

    public static void main(String[] args) {
        char karakter = 69;
        boolean sesliMi = false;
        sesliMi = (karakter == 'A') ? true : sesliMi;
        sesliMi = (karakter == 'E') ? true : sesliMi;
        sesliMi = (karakter == 'U') ? true : sesliMi;
        sesliMi = (karakter == 'I') ? true : sesliMi;
        System.out.println(sesliMi);
    }

}
