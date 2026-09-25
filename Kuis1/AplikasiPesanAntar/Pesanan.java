package Kuis1.AplikasiPesanAntar;

public class Pesanan {
    private String Nama;
    private Kurir Kode;
    private Pesanan Harga;
    private String InfoKurir;

public Pesanan() {
}
public void setNama(String nama) {
    Nama = nama;
}
public String getNama() {
    return Nama;
}
public void setKode(Kurir kode) {
    Kode = kode;
}

public Kurir getKode() {
    return Kode;
}
public void setHarga(Pesanan harga) {
    Harga = harga;
}
public Pesanan getHarga() {
    return Harga;
}
public void setInfoKurir(String infoKurir) {
    InfoKurir = infoKurir;
}
public String getInfoKurir() {
    return InfoKurir;
}
public int HitungBiayaTotal() {
   return Kurir.HitungBiayaKurir(Jarak) + Restoran.HitungJarak(Biaya);
}
}
