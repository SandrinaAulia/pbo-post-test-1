/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest1;

/**
 *
 * @author ASUS
 */
//property
public class Karyawan { 
    public String nama_karyawan;
    public String nomor_karyawan;
    public String jabatan;
    public float rating_kinerja;
    public int gaji;

//constructor
    public Karyawan(String nama_karyawan, String nomor_karyawan, String jabatan, float rating_kinerja, int gaji) {
        this.nama_karyawan = nama_karyawan;
        this.nomor_karyawan = nomor_karyawan;
        this.jabatan = jabatan;
        this.rating_kinerja = rating_kinerja;  
        this.gaji = gaji;
    }
    
//method
    public String getNama_karyawan(){
        return nama_karyawan;
    }
    
    public String getNomor_karyawan(){
        return nomor_karyawan;
    }
    
    public String getJabatan(){
        return jabatan;
    }
    
    public float getRating_kinerja(){
        return rating_kinerja;
    }
    
    public int getGaji(){
        return gaji;
    }
}
