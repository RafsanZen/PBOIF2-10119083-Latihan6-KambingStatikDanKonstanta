/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama : Rafsan Zen Mustaofa
 * NIM  : 10119083
 * Kelas: IF-2
 * Deskripsi: Kambing Statik
 */
public class KambingStatic {
      //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
/**
     * @param args the command line arguments
      */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println( NAMA_KAMBING + " memiliki kambing sebanyak = "
                                             + Mamalia.jumlahKambing);
    }
    
}
