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
public class Ornek6 {
    public static void main(String[] args) {
        /*
        1	*	*	*	*	1
        3     	 5	*	*	*	4
        7	 9	11	*	*	9
        13	15	17	19	*	18
        21	23	25	27	29	25

        */
        int sayi=1;
        for (int i = 1; i <= 5; i++) {
            int satirToplam=0;
            for (int j = 1; j <= 5; j++) {
                if (i>=j){
                    System.out.print(sayi+"  ");
                    satirToplam+=sayi;
                    sayi+=2;
                }else{
                    System.out.print("*  ");
                }
            }
             System.out.println(satirToplam/i+" ");
        }
        
    }
}
