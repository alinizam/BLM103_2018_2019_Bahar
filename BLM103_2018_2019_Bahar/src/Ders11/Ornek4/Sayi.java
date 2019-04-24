/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek4;

/**
 *
 * @author alinizam
 */
public class Sayi {

    int x;
    static int y;
    //Hatalı kod
    /*static int getX() {
        //Hatalı kod
        //return x;
    }*/

    static int getY() {
        return y;
    }

    int geyXY() {
        return x * y;
    }
}
