/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek3;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Fabrika {
    ArrayList<Personel> personeller=new ArrayList();
    int getToplamMaas(){
        int toplam=0;
        for (Personel personel : personeller) {
            toplam+=personel.getMaas();
        }
        return toplam;
    }
}
