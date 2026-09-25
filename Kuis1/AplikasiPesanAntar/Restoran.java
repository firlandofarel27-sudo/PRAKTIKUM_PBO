package Kuis1.AplikasiPesanAntar;

public class Restoran {
   private String Nama;
   private int Jarak;

   public Restoran() {
   }
   public void setNama(String nama) {
       Nama = nama;
   }
   public String getNama() {
       return Nama;
   }
   public void setJarak(int jarak) {
       Jarak = jarak;
   }
   public int getJarak() {
       return Jarak;
   }
   public int HitungJarak(int Biaya) {
        return Jarak * Biaya;
   }
}
