/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13.Ornek6;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Araba araba=new Tesla();
        Tesla t=(Tesla)araba;
        System.out.println(t.getVoltaj());
    }
}
