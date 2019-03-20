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
public class Ornek3a {
    public static void main(String[] args) {
        int n=6;
        int sonuc=1;
        int i=1;
        while(i<=n){
            sonuc=sonuc*i;
            i++;
        }
        System.out.println("sonuc="+sonuc);
    }
}
