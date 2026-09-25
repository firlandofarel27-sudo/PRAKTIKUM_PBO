package Kuis1.AplikasiPesanAntar;

public class MainPesanAntar {
    public static void main(String[] args) {
        Kurir k = new Kurir();
        k.setNama("Vito");
        k.setBiaya(350000);

        Restoran s = new Restoran();
        s.setNama("Dominos");
        s.setJarak(200000);

        Pesanan p = new Pesanan();
        p.setNama("Pizza");
        p.setHarga(p);
        p.setKode(k);
        p.setInfoKurir(p);

        System.out.println("Biaya Total = " + p.HitungBiayaTotal());
        System.out.println(p.getNama().getHarga());
    }
}
