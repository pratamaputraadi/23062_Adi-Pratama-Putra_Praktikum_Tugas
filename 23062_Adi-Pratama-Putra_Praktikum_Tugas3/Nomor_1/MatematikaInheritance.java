/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_3.Nomor_1;

/**
 * PERTEMUAN 3 - PEMROGRAMAN BERORIENTASI OBJEK
 * LATIHAN NOMOR 1
 * @author Adi Pratama Putra
 */

class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 hasil = new Matematika2();

        int hasilPertambahan = hasil.pertambahan(20, 10); // OPERASI PENJUMLAHAN DI VARIABEL hasilPenjumlahan.
        int hasilPengurangan = hasil.pengurangan(10, 5); // OPERASI PENGURANGAN DI VARIABEL hasilPngurangan.
        int hasilPerkalian = hasil.perkalian(10, 3); // OPERASI PERKALIAN DI VARIABEL hasilPerkalian.
        int hasilPembagian = hasil.pembagian(21, 2); // OPERASI PEMBAGIAN DI VARIABEL hasilPembagian.
        int hasilModulus = hasil.modulus(21, 2); // OPERASI PEMBAGIAN DI VARIABEL hasilPembagian.
        
        System.out.println("Pertambahan: 20 + 10 = " + hasilPertambahan); // MENAMPILKAN HASIL PERTAMBAHAN
        System.out.println("Pengurangan: 10 - 5  = " + hasilPengurangan); // MENAMPILKAN HASIL PENGURANGAN
        System.out.println("Perkalian: 10 * 3    = " + hasilPerkalian); // MENAMPILKAN HASIL PERKALIAN
        System.out.println("Pembagian: 21 / 2    = " + hasilPembagian); // MENAMPILKAN HASIL PEMBAGIAN
        System.out.println("Modulus : 21 / 2     = " + hasilModulus); // MENAMPILKAN HASIL MODULUS
        
    }
}

// TERIMA KASIH - THANK YOU//