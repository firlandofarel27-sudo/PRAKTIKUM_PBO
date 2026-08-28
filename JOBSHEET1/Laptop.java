package JOBSHEET1;

public class Laptop {
    String merk;
    int ram;

    public void menyala() {
        System.out.println("Laptop menyala.");
    }

    public void menjalankanProgram() {
        System.out.println("Laptop menjalankan program.");
    }

    public void cetakInformasi() {
        System.out.println("Merk : " + merk);
        System.out.println("RAM  : " + ram + " GB");
    }
}
