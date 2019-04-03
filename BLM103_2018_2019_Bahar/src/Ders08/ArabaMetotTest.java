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
public class ArabaMetotTest {
    public static void main(String[] args) {
        Araba a=new Araba();
       
        a.sonHiz=10;
        a.hizlan();
        System.out.println(a.anlikHiz);   
        
        for (int i = 0; i < 15; i++) {
            
            a.hizlan();
            System.out.println(a.anlikHiz);
        }
        //Parametre alan ama değer döndürmeyen metot 
       Araba a2=new Araba();
       a2.sonHiz=100;
       a2.degereGoreHizlan(40);
       a2.degereGoreHizlan(40);
       a2.degereGoreHizlan(40);
       System.out.println("a2 hiz = "+a2.anlikHiz);
       
       //Parametre almayan ama değer döndüren metot 
       Araba a3=new Araba();
       a3.sonHiz=100;
      
       System.out.println(a3.hizlanVeGetAnlikHiz());
         
        //Parametre almayan ama değer döndüren metot 
       Araba a4=new Araba();
       a4.sonHiz=100;
      
       System.out.println(a4.degereGoreHizlanveGetAnlikHiz(25));
       System.out.println(a4.degereGoreHizlanveGetAnlikHiz(85));
    
    }
}
