/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan61_bangunruang;

/**
 *
 *Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan hasil hitung
* volume dari bola, kerucut, dan tabung dengan konsep abstract
 */
public class Bola extends BangunRuang {
    private double jari2;
 

    public double getJari2() {
        return jari2;
    }

    public void setJari2(double jari2) {
        this.jari2 = jari2;
    }

    public double hitungVolume() {
        this.volume = (4/3) * 3.14 * (jari2*jari2*jari2);
        return this.volume;
    }
}
