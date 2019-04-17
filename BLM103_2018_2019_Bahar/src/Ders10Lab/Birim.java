/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10Lab;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Birim {
    String birimAdi;
    ArrayList<Personel> calisanlar=new ArrayList(); 
    void personeliBirimeAta(Personel p){
        calisanlar.add(p);
    }
}
