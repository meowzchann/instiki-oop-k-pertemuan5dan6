/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg5602;

import java.util.Scanner;

/**
 *
 * @author Ayu Sri Ratnasari
 * Tanggal : 26 April 2025
 * 
 */
public class Pertemuan5602 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LuasSegitiga Segitiga01 = new LuasSegitiga();
        
        Scanner dtain = new Scanner (System.in);
//        Segitiga01.alas = 8;
//        Segitiga01.tinggi = 3;
        
        System.out.println("Hitung Luas Segitiga");
        System.out.print("Masukkan nilai alas: ");
        Segitiga01.alas = Integer.parseInt(dtain.nextLine());
        System.out.print("Masukkan nilai tinggi: ");
        Segitiga01.tinggi = Integer.parseInt(dtain.nextLine());
        
        System.out.printf("Luas = alas * tinggi /2 \n");
        System.out.printf("Luas = %d * %d /2 \n",Segitiga01.alas, Segitiga01.tinggi);
        System.out.printf("Luas Segitiga : "+Segitiga01.HitungLuas());
    }
    
}
