package JOBSHEET1;

public class Demo {
    public static void main(String[] args) {

        // Membuat objek Kendaraan
        Kendaraan kendaraan = new Kendaraan();
        kendaraan.merk = "Honda";
        kendaraan.tahun = 2022;

        System.out.println("=== KENDARAAN ===");
        kendaraan.cetakInformasi();
        kendaraan.bergerak();
        kendaraan.berhenti();

        System.out.println();

        // Membuat objek Motor
        Motor motor = new Motor();
        motor.merk = "Yamaha";
        motor.tahun = 2024;
        motor.cc = 155;
        motor.jenis = "Sport";

         System.out.println("=== MOTOR ===");
        motor.cetakInformasi();
        motor.menyalakanMesin();
        motor.membunyikanKlakson();

        System.out.println();

        // Membuat objek Mobil
        Mobil mobil = new Mobil();
        mobil.merk = "Toyota";
        mobil.tahun = 2023;
        mobil.jumlahPintu = 4;
        mobil.bahanBakar = "Bensin";

        System.out.println("=== MOBIL ===");
        mobil.cetakInformasi();
        mobil.menyalakanMesin();
        mobil.membukaPintu();

        System.out.println();

        // Membuat objek Laptop
        Laptop laptop = new Laptop();
        laptop.merk = "ASUS";
        laptop.ram = 16;

        System.out.println("=== LAPTOP ===");
        laptop.cetakInformasi();
        laptop.menyala();
        laptop.menjalankanProgram();
    }
}
