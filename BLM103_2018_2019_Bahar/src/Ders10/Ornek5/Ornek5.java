/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek5;

/**
 *
 * @author alinizam
 */
public class Ornek5 {

    public static void main(String[] args) {
        //Dizi Toplam
        int A[][] = {{1, 3}, {3, 6}, {2, 2}};
        int toplam = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                toplam+=A[i][j];
            }
        }
        System.out.println("Toplam = "+toplam);
    }
}
