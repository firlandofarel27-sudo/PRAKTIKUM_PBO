package JOBSHEET1;

public class Kendaraan {
    String merk;
    int tahun;
    int cc;
    String jenis;

    public void bergerak() {
        System.out.println("Kendaraan sedang bergerak.");
    }

    public void berhenti() {
        System.out.println("Kendaraan berhenti.");
    }

    public void menyalakanMesin() {
        System.out.println("menyalakanMesin");
    }

    public void membunyikanKlakson() {
        System.out.println("membunyikanKlakson");
    }

    public void cetakInformasi() {
        System.out.println("Merk  : " + merk);
        System.out.println("Tahun : " + tahun);
        System.out.println("CC    : " + cc );
        System.out.println("Jenis : " + jenis );
    }
}
