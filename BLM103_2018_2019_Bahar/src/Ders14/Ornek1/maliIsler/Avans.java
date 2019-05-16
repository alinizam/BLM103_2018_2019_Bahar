/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek1.maliIsler;

import Ders14.Ornek1.personel.Personel;
import Ders14.Ornek1.personel.Izin;


/**
 *
 * @author alinizam
 */
public class Avans {
    public Personel personel;
    public Izin izin;
    private int miktar;
    int geriOdeme;
    protected int ozelMiktar;
    void birSeyYap(){
       Personel p=new Personel();
       //Sınıf içi özel private erişimi.
       Avans a=new Avans();
       a.miktar=3000;
      
    }
}
