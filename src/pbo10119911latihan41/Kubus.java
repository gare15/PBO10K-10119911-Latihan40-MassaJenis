/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119911latihan41;

/**
 *
 * @author
 * Nama : Mochamad Tegar
 * NIM : 10119911
 * Kelas : IF 10K
 */
public class Kubus {
    private int sisi,massa;
    
    public int getSisi(){
        return sisi;
    }
    
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    
    public int getMassa(){
        return massa;
    }
    
    public void setMassa(int massa){
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
        return parSisi*parSisi*parSisi;
    }
    
    public int hitungMassaJenis(int parMassa,int volume){
        return parMassa/volume;
    }
}
