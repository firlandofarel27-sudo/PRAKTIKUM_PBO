package JOBSHEET1;

public class Motor extends Kendaraan {
    String merk;
    int tahun;

    public void bergerak() {
        System.out.println("Kendaraan sedang bergerak.");
    }

    public void berhenti() {
        System.out.println("Kendaraan berhenti.");
    }

    public void cetakInformasi() {
        System.out.println("Merk  : " + merk);
        System.out.println("Tahun : " + tahun);
        System.out.println("");
    }
}
