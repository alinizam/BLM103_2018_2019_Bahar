/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek1.personel;

import Ders14.Ornek1.maliIsler.Avans;
import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Personel {
    private ArrayList<Izin> izinler=new ArrayList();
    Avans a;
    private int maas;

    void avansVer() {

    }

    public int getMaas() {
        return maas;
    }
    int asgariMaas = 2200, azamiMaas = 20000;

    public void setMaas(int maas) {
        if (maas < asgariMaas || maas > azamiMaas) {
            System.out.println("Sınır dışında bir maaş veremezsiniz.");
        } else {
            this.maas = maas;
        }
    }

    public ArrayList<Izin> getIzinler() {
        return izinler;
    }

    public void addIzin(Izin izin) {
        this.izinler.add(izin);
    }

}
