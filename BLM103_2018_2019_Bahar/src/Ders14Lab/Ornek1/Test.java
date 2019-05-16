/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab.Ornek1;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        IHareket bilesen=new Pencere();
        bilesen.setXY(10, 20);
        bilesen.HareketEt(30);
        System.out.println("x : "+bilesen.getX()+"   y: "+bilesen.getY());
        
        
        bilesen=new Buton();
        bilesen.setXY(10, 20);
        //bilesen.HareketEt(30);
        System.out.println("x : "+bilesen.getX()+"   y: "+bilesen.getY());
        
        Ekran e1 = new Ekran();
        e1.elemanEkle(bilesen);
        Buton b1 = new Buton();
        b1.setXY(5, 10);
        e1.elemanEkle(b1); 
        Buton b2 = new Buton();
        b2.setXY(10, 15);
        e1.elemanEkle(b2);
        
        System.out.println(e1.getToplamAlan());
        
        
        
    }
}
