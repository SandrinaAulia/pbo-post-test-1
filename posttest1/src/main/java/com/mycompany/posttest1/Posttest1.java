/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Posttest1 {

    public static void main(String[] args) {
        ArrayList<Karyawan> karyawans = new ArrayList<>();
        
        //inisialisasi 5 objek
        Karyawan karyawansatu = new Karyawan("Sandrina", "202001021001", "CEO", 4.5f, 25000000);
        Karyawan karyawandua = new Karyawan ("Novi", "202111022001", "Manager", 4.2f, 15000000);
        Karyawan karyawantiga = new Karyawan("Santia", "202001023001", "Staff", 3.9f, 10000000);
        Karyawan karyawanempat = new Karyawan("Dinnuhoni", "202001024001", "Konsultan", 4.5f, 12000000);
        Karyawan karyawanlima = new Karyawan("Daniel", "202201025001", "Teknisi", 3.5f, 7000000);
        
        //menambahkan berbagai macam objek ke dalam ArrayList
        karyawans.add(karyawansatu);
        karyawans.add(karyawandua);
        karyawans.add(karyawantiga);
        karyawans.add(karyawanempat);
        karyawans.add(karyawanlima);
        
        //String Concatenation (Penggabungan String)
        StringBuilder result = new StringBuilder();
        for (Karyawan karyawan : karyawans) {
            result.append(karyawan.nama_karyawan);
            result.append("(" + karyawan.nomor_karyawan + ")")
              .append("adalah karyawan dengan jabatan sebagai")
              .append(karyawan.jabatan)
              .append("dengan rating kinerja yakni")
              .append(karyawan.rating_kinerja)
              .append(".\n");
              
        }
        
        //menampilkan hasil penggabungan
        System.out.println(">>>>> Data Karyawan Terkini <<<<<");
        System.out.println(result.toString());
        
        }
          
    }

    

