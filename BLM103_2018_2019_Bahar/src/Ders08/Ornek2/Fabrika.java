/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders08.Ornek2;

/**
 *
 * @author alinizam
 */
public class Fabrika {
    Araba arabaUret(){
        Araba a=new Araba();
        a.model="S Serisi";
        return a;
    } 
    Araba modelliArabaUret(String uretilecekModelinAdi){
        Araba a=new Araba();
        a.model=uretilecekModelinAdi;
        return a;
    }
}
