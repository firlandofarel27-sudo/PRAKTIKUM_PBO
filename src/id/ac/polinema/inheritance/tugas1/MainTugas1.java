package src.id.ac.polinema.inheritance.tugas1;

public class MainTugas1 {
     public static void main(String[] args) {

        DaftarGaji daftar = new DaftarGaji(2);

        Pegawai pegawai =
            new Pegawai(
                "P001",
                "Budi",
                "Malang"
            );

        Dosen dosen =
            new Dosen(
                "D001",
                "Siti",
                "Surabaya",
                12
            );

        daftar.addPegawai(pegawai);
        daftar.addPegawai(dosen);

        daftar.printSemuaGaji();
    }
}
