package src.id.ac.polinema.inheritance.tugas1;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected String alamat;

    public Pegawai(
        String nip,
        String nama,
        String alamat
    ) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public int getGaji() {
        return 1500000;
    }

    public String getNama() {
        return nama;
    }
}
