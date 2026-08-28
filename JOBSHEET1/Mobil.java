package JOBSHEET1;

public class Mobil extends Kendaraan {
    int jumlahPintu;
    String bahanBakar;

    public void menyalakanMesin() {
        System.out.println("Mesin mobil dinyalakan.");
    }

    public void membukaPintu() {
        System.out.println("Pintu mobil dibuka.");
    }

    public void cetakInformasi() {
        System.out.println("Merk         : " + merk);
        System.out.println("Tahun        : " + tahun);
        System.out.println("Jumlah Pintu : " + jumlahPintu);
        System.out.println("Bahan Bakar  : " + bahanBakar);
    }
}
