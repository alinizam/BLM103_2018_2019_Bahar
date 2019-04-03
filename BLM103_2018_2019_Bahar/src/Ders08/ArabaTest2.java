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
public class ArabaTest2 {
    public static void main(String[] args) {
        Araba a1=new Araba();
        a1.model="Kartal";
        Araba a2=new Araba();
        a2=a1;
        
        System.out.println(a2.model);
        a2.model="Anka";
        System.out.println(a1.model);
        
        
        Araba araba1=new Araba();
        araba1.sonHiz=5;
        Araba araba2;
        araba2=araba1;
        araba1.sonHiz=3;
        System.out.println(araba1.sonHiz);  
        System.out.println(araba2.sonHiz);  
        System.out.println(araba1);
        System.out.println(araba2);
        araba2.sonHiz=100;
        System.out.println(araba1.sonHiz);  
        System.out.println(araba2.sonHiz);  

    }
}
