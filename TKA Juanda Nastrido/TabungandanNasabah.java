package pbo20maret2025;

import java.util.Scanner;

public class TabungandanNasabah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("=== TEST KELAS TABUNGAN ===");

        System.out.print("Masukkan saldo awal tabungan: ");
        int saldoAwal = scanner.nextInt();
        Tabungan tabungan = new Tabungan(saldoAwal);
        System.out.println("Tabungan berhasil dibuat dengan saldo: " + tabungan.getSaldo());
        

        System.out.print("\nMasukkan jumlah uang yang akan disimpan: ");
        int jumlahSimpan = scanner.nextInt();
        tabungan.simpanUang(jumlahSimpan);
        System.out.println("Saldo setelah simpan: " + tabungan.getSaldo());
        

        System.out.print("\nMasukkan jumlah uang yang akan diambil: ");
        int jumlahAmbil = scanner.nextInt();
        boolean berhasil = tabungan.ambilUang(jumlahAmbil);
        if (berhasil) {
            System.out.println("Penarikan berhasil. Saldo sekarang: " + tabungan.getSaldo());
        } else {
            System.out.println("Penarikan gagal. Saldo tidak mencukupi.");
        }
        

        System.out.println("\n=== TEST TRANSFER ===");
        Tabungan tabungan2 = new Tabungan(0);
        System.out.println("Tabungan tujuan dibuat dengan saldo: " + tabungan2.getSaldo());
        
        System.out.print("Masukkan jumlah transfer: ");
        int jumlahTransfer = scanner.nextInt();
        boolean transferBerhasil = tabungan.transfer(tabungan2, jumlahTransfer);
        
        if (transferBerhasil) {
            System.out.println("Transfer berhasil!");
            System.out.println("Saldo tabungan asal: " + tabungan.getSaldo());
            System.out.println("Saldo tabungan tujuan: " + tabungan2.getSaldo());
        } else {
            System.out.println("Transfer gagal. Saldo tidak mencukupi.");
        }
        

        System.out.println("\n=== TEST KELAS NASABAH ===");
        scanner.nextLine(); 
        
 
        System.out.print("Masukkan nama depan nasabah: ");
        String namaAwal = scanner.nextLine();
        System.out.print("Masukkan nama belakang nasabah: ");
        String namaAkhir = scanner.nextLine();
        
        Nasabah nasabah1 = new Nasabah(namaAwal, namaAkhir);
        System.out.println("Nasabah tanpa tabungan berhasil dibuat: " + nasabah1.toString());
        
     
        System.out.print("\nMasukkan nama depan nasabah kedua: ");
        namaAwal = scanner.nextLine();
        System.out.print("Masukkan nama belakang nasabah kedua: ");
        namaAkhir = scanner.nextLine();
        
        Nasabah nasabah2 = new Nasabah(namaAwal, namaAkhir);
        nasabah2.setTabungan(tabungan); 
        System.out.println("Nasabah dengan tabungan berhasil dibuat: " + nasabah2.toString());
        
     
        System.out.println("\nInformasi tabungan nasabah kedua:");
        Tabungan tabunganNasabah = nasabah2.getTabungan();
        System.out.println("Saldo: " + tabunganNasabah.getSaldo());
        
   
        System.out.println("\nMenambahkan tabungan ke nasabah pertama...");
        nasabah1.setTabungan(tabungan2);
        System.out.println("Update data nasabah pertama: " + nasabah1.toString());
        
        scanner.close();
    }
}