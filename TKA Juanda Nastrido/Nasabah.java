
package pbo20maret2025;

/**
 *
 * @author Windows
 */
public class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    private Tabungan tabungan;
    
    public Nasabah(String namaAwal, String namaAkhir){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }
    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
    public Tabungan getTabungan(){
        return tabungan;
    }
    
   @Override
   public String toString(){
       if (tabungan !=null){
           return namaAwal + " " + namaAkhir + " - " + tabungan.toString();
     } else{
           return namaAwal + " " + namaAkhir + " - Tidak ada tabungan";       }
   }
}
