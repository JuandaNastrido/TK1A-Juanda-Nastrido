/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo20maret2025;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class TestPersegiPanjang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Kondisi awal, sebelum pembuatan objek");
        System.out.println("Jumlah persegi panjang"+PersegiPanjang.JumlahObjek);
        
        PersegiPanjang pp1 = new PersegiPanjang(8,5);
        System.out.println("Panjang = "+pp1.panjang);
        System.out.println("Lebar = "+pp1.lebar);
        
        System.out.println("Luas = "+pp1.panjang+" * "+pp1.lebar+" = "+pp1.getLuas());
        System.out.println("keliling persegi panjang 1 = "+pp1.getKeliling());

        
        PersegiPanjang pp2 = new PersegiPanjang();
        System.out.print("Masukkan Panjang = ");
        pp2.panjang=in.nextInt();
        System.out.print("Masukkan Lebar = ");
        pp2.lebar=in.nextInt();
        System.out.println("Luas persegi panjang 2 = "+pp2.getLuas());
        System.out.println("keliling persegi panjang 2 = "+pp2.getKeliling());
        System.out.println("Jumlah persegi panjang saat ini = "+PersegiPanjang.JumlahObjek);  
    }
    
    
}
