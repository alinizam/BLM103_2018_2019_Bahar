/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek10;

/**
 *
 * @author alinizam
 */
public class Ornek10 {

    public static void main(String[] args) {
        //İki boyutlu dizide eleman arama
        int A[][] = {{1, 3, 5}, {3, 3, 6}, {1, 1, 1}};
        int aranan = 3;
        boolean varMi = false;
        dis:
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.println(i+" "+j+": "+A[i][j] );
                if (A[i][j] == aranan) {
                    varMi = true;
                    break dis;
                }
            }
        }
        System.out.println("Var mi =" + varMi);

    }
}
