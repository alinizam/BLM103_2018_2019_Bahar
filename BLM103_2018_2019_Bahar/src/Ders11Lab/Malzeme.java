/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

/**
 *
 * @author alinizam
 */
public class Malzeme {
    String adi;
    int fiyat;

    public Malzeme(String adi, int fiyat) {
        this.adi = adi;
        this.fiyat = fiyat;
        Fabrika.malzemeAta(this);
    }
    
}
