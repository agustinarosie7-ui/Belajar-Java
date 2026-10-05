/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

/**
 *
 * @author LENOVO
 */
// Program menampilkan panjang sisi miring dari segitiga siku-siku dengan alas dan tinggi yang diketahui
public class SegiTigaSikuSiku { // Awal dari class
    public static void main (String [] args) { // Awal dari main
        int alas, tinggi; // Deklarasi untuk variabel alas dan tinggi.
        double panjangSisiMiringSegSiku; // Deklarasi untuk variabel panjangSisiMringSegSiku.
        
        alas = 8; // Nilai dari variabel alas
        tinggi = 10; // Nilai dari variabel tinggi
        panjangSisiMiringSegSiku = Math.sqrt((alas*alas) + (tinggi*tinggi));
        /* Variabel panjangSisiMiringSegSiku yang memiliki nilai rumus panjang sisi miring 
        segitiga siku - siku.
        Di variabel panjangSisiMiringSegSiku menggunakan Math.sqrt karena rumus dari panjang 
        segitiga siku - siku, menggunakan akar. Untuk menggunakan akar di dalam pemrograman Java 
        menggunakan ketentuan yaitu Math.sqrt 
        Dalam rumus tersebut akan di hitung alas * alas dan tinggi * tinggi terlebih dahulu
        lalu jumlah perkalian masing - masing tersebut di jumlahkan dan hasil jumlahnya akan di akar kuadrat(2).
        */
        
        System.out.println ("Panjang sisi miring segitiga siku-siku adalah " + panjangSisiMiringSegSiku);
        /* Menampilkan tulisan "Panjang sisi miring segitiga siku-siku adalah " dan 
        menampilkan hasil dari variabel panjangSisiMiringSegSiku.
        */
    } // Akhir dari main
    
} // Akhir dari class
