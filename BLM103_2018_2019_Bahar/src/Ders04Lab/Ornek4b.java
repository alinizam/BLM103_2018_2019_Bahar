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
public class Ornek4b {
    public static void main(String[] args) {
          int n=10;
        int f=1;
        for (int i = 0; i <= n; i++) {
            f=1;
            for (int j = 1; j <= i; j++) {
                f = f * j;
            }
            System.out.println(i+"'nin faktöriyeli = "+f);
            
        }

    }
}
