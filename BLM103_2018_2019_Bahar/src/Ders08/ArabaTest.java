/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08;

/**
 *
 * @author alinizam
 */
public class ArabaTest {
    public static void main(String[] args) {
        int i=5;
        
        Araba araba1=new Araba();
        araba1.model="Mercedes";
        araba1.renk="Mavi";
        araba1.sonHiz=200;
        
        System.out.println(araba1.model);
        
        Araba araba2=new Araba();
        System.out.println(araba2.model);
                 
    }
}
