/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan61_bangunruang;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan hasil hitung
* volume dari bola, kerucut, dan tabung dengan konsep abstract
 */
public class PBO3_10117082_Latihan61_BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.setJari2(7);
        System.out.println("Volume Bola dengan jari-jari "+bola.getJari2()+
                " adalah " + bola.hitungVolume());
        
        Tabung tb = new Tabung();
        tb.setTinggi(21);
        tb.setJari2(10);
        System.out.println("Volume Tabung dengan jari-jari "+tb.getJari2()+
                " dan tinggi "+tb.getTinggi()+" adalah " + tb.hitungVolume());
        
        
        Kerucut kc = new Kerucut();
        kc.setJari2(14);
        kc.setTinggi(9);
        System.out.println("Volume Kerucut dengan jari-jari "+kc.getJari2()+
                " dan tinggi "+kc.getTinggi()+" adalah " + kc.hitungVolume());
    }
}
