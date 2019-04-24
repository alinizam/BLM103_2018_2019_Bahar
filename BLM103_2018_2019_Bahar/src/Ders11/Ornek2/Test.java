/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek2;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author alinizam
 */
public class Test {
    public static void main(String[] args) {
        Personel p=new Personel();
        Personel p1=new Personel(10000,"Ahmet","Ak");
        System.out.println(p1.adi);
        ArrayList<Personel> personeller=new ArrayList();
        personeller.add(new Personel(15000));
        personeller.add(new Personel(10000,"Ahmet","Ak"));
        personeller.add(new Personel());
        
        Araba a=new Araba();
        a=null;
        String s="";
        for (int i = 0; i < 10000; i++) {
            s+="a";
        }
    }
}
