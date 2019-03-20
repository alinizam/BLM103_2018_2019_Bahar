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
public class Ornek5 {
    /*
    1	2	3	3
    4	5	6	6
    7	8	9	9
    10	11	12	12
    13	14	15	15
    */
    public static void main(String[] args) {
        int sayi=0;
        for (int satir = 0; satir < 5; satir++) {
            for (int sutun = 0; sutun <3; sutun++) {
                sayi++;
                System.out.print(sayi + " ");
            }
            System.out.println(sayi+" ");
        }
    }
}
