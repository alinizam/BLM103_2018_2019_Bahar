/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11.Ornek4;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Araba {
    static ArrayList<Araba> arabalar=new ArrayList();
    int fiyat;
    String sube;
    public Araba(int fiyat) {
        this.fiyat=fiyat;
        arabalar.add(this);
    }

    public Araba(int fiyat, String sube) {
        this.fiyat = fiyat;
        this.sube = sube;
        arabalar.add(this);
    }
    void getOzellik(){
        fiyat=1000;
        System.out.println(arabalar);
    }
    
}
