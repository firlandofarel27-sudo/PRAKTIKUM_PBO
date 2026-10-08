package src.id.ac.polinema.inheritance.tugas2;

public class TelevisiModern extends Televisi {
     private String judulDVD = "";

    public TelevisiModern(
        String merk,
        int jumlahChannel
    ) {
        super(merk, jumlahChannel);
    }

    public void masukkanDVD(String judul) {
        this.judulDVD = judul;
    }

    public void mainkanDVD() {

        String judul;

        if (judulDVD.isEmpty()) {
            judul = "kosong";
        } else {
            judul = judulDVD;
        }
    System.out.println(
            "Sedang memainkan DVD: " + judul
        );
    }
}
