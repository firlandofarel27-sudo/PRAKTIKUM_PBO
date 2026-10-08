package src.id.ac.polinema.inheritance.tugas1;

public class DaftarGaji {
     private Pegawai[] daftarPegawai;
    private int jumlahPegawai;

    public DaftarGaji(int kapasitas) {
        daftarPegawai = new Pegawai[kapasitas];
    }

    public void addPegawai(Pegawai pegawai) {

        if (jumlahPegawai < daftarPegawai.length) {

            daftarPegawai[jumlahPegawai] = pegawai;

            jumlahPegawai++;
        }
    }

    public void printSemuaGaji() {

        for (int i = 0; i < jumlahPegawai; i++) {

            System.out.println(
                daftarPegawai[i].getNama()
                + " : "
                + daftarPegawai[i].getGaji()
            );
        }
    }
}
