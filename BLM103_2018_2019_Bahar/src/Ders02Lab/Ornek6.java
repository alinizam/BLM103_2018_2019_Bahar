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
public class Ornek6 {
    public static void main(String[] args) {
        double a=25.6161616;
        double b=26.9;
        double aninKusurati= a- (int)a;
        double bninKusurati= b- (int)b;
        String sonuc=(aninKusurati>bninKusurati) ? "A BÜYÜK" : "B BÜYÜK";
        System.out.println(sonuc);
        System.out.println("A nın küsüratı büyük mü? "+(aninKusurati>bninKusurati));
    }
}
