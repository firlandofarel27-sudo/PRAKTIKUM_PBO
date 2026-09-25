package Kuis1.AplikasiPesanAntar;

public class Kurir {
    private String Nama;
    private int Biaya;

    public Kurir() {
    }
    public void setNama(String nama) {
        Nama = nama;
    }
    public String getNama() {
        return Nama;
    }
    public void setBiaya(int biaya) {
        Biaya = biaya;
    }
    public int getBiaya() {
        return Biaya;
    }
    public int HitungBiayaKurir(int Jarak) {
        return Biaya * Jarak;
    }
}
