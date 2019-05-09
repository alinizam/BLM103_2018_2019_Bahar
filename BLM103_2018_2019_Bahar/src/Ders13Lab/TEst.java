/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab;

import java.util.Arrays;

/**
 *
 * @author alinizam
 */
public class TEst {
    public static void main(String[] args) {
        Fabrika f=new Fabrika();
        f.personelEkle(new Memur());
        f.personelEkle(new Memur());
        f.personelEkle(new Personel());
        f.personelEkle(new Isci());
        f.personelEkle(new Memur());
        f.personelEkle(new Sozlesmeli());
        String[] turAdetler=f.getPersonelTurAdet();
        System.out.println(Arrays.asList(turAdetler));
    }
}
