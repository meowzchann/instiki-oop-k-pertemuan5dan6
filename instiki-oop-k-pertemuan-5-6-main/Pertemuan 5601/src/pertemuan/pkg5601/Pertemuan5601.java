/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg5601;

/**
 *
 * @author Ayu Sri Ratnasari
 * Tanggal : 26 April 2025
 * 
 */
public class Pertemuan5601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       manusia johan = new manusia("L");
       johan.warnakulit  = "brown";
       johan.SetWarnaRambut("hitam");
       
       manusia yani = new manusia("P");
       yani.warnakulit = "sawo matang";
       yani.SetWarnaRambut("coklat");
       
    }
    
}

class manusia{
    public String warnakulit = "";
    private String warnarambut = "";
    private String jeniskelamin = "";
    
    //constructor
    public manusia(String jkel){
        this.jeniskelamin = jkel;
    }
    
    public void SetWarnaRambut(String warna){
        //menambahkan kode identifikasi
        this.warnarambut = warna;
        
    }
}
