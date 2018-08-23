/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugaspraktikum;

/**
 *
 * @author Rizky17
 */
import java.lang.Math;
public class Bola {
    
    double jarijari= 14;
    double diameter ;
    double luas ;
    double volume;
    
    public void setjari(double jarijari){
    this.jarijari = jarijari;
    
    }
    
    public void showdiameter(){
    this.diameter=2*jarijari;
    }
    
    public void showluas(){
    this.luas=4*Math.PI*jarijari*jarijari;
    
    }
    
    public void showvolume(){
    this.volume=(4*Math.PI*jarijari*jarijari*jarijari)/3;
    }
    public void cetak (){
        System.out.println("jari-jari : " +jarijari+ "cm ");
        System.out.println("______________________________ ");
        System.out.println("diameter :" +diameter+ "cm ");
        System.out.println("Luas : " +luas+ "cm kuadrat");
        System.out.println("Volume :" +volume+ "cm kubik");
        
    }
}