/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek14;

import java.util.ArrayList;

/**
 *
 * @author alinizam
 */
public class Ornek13 {
    public static void main(String[] args) {
        ArrayList<String> iller=new ArrayList();
        iller.add("İstanbul");
        iller.add("Tokat");
        iller.add("Muş");
        System.out.println(iller.contains("Muş"));
        System.out.println(iller.indexOf("Muş"));
        System.out.println(iller.set(0, "Ankara"));
        System.out.println(iller);
    }
}
