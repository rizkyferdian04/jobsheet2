/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author Hafiyyan Faza XIR5
 */
public class UjiBus {
    public static void main(String[] args) {
        Bus busMini = new Bus();
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        busMini.cetak();
        
        busMini.penumpang=busMini.penumpang + 5;
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();
        
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }
}
