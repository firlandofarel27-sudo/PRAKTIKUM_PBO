|  | Pemrograman Berbasis Objek |
|--|--|
| NIM |  254107020031|
| Nama |  Farel Firlando |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/firlandofarel27-sudo/PRAKTIKUM_PBO) |

# Labs #1 Programming Fundamentals Review
## Jawaban Soal
1. Class adalah blueprint atau prototype yang digunakan sebagai dasar untuk membuat object. Sedangkan object adalah hasil instansiasi dari sebuah class yang memiliki state (atribut) dan behaviour (method). Contohnya, Bike merupakan class, sedangkan sepeda tertentu yang dibuat dari class Bike merupakan object.
2. gear dan brand dapat menjadi atribut karena keduanya merupakan state atau ciri-ciri yang dimiliki oleh object Bike. Brand menunjukkan merek sepeda, sedangkan gear menunjukkan posisi atau jumlah gigi yang dimiliki sepeda. Dalam PBO, state atau ciri-ciri object direpresentasikan sebagai atribut.
3. Salah satu kelebihan utama PBO adalah program lebih fleksibel dan modular. Perubahan atau penambahan fitur pada suatu bagian program tidak selalu mengganggu keseluruhan program. Selain itu, PBO dapat mengurangi penggunaan kode yang berulang
4. Ya, diperbolehkan. Dalam Java, beberapa atribut dengan tipe data yang sama dapat dideklarasikan dalam satu baris menggunakan tanda koma.
5. Karena RoadBike merupakan turunan dari class Bike dengan menggunakan extends Bike. Dengan inheritance, RoadBike otomatis mewarisi atribut dan method yang dimiliki Bike, sehingga atribut seperti brand, speed, dan gear tidak perlu ditulis ulang. RoadBike hanya perlu menambahkan fitur khusus yang belum dimiliki Bike, misalnya tireWidth

## Tugas
Kode program tugas!
Kode Kendaraan
```
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

```
Kode Motor
```
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

```
Kode Mobil
```
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

```
Kode Laptop
```
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

```
Kode Demo
```
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

```
Hasil Runing Kode Program
```
=== KENDARAAN ===
Merk  : Honda
Tahun : 2022
CC    : 0
Jenis : null
Kendaraan sedang bergerak.
Kendaraan berhenti.

=== MOTOR ===
Merk  : Yamaha
Tahun : 2024

menyalakanMesin
membunyikanKlakson

=== MOBIL ===
Merk         : Toyota
Tahun        : 2023
Jumlah Pintu : 4
Bahan Bakar  : Bensin
Mesin mobil dinyalakan.
Pintu mobil dibuka.

=== LAPTOP ===
Merk : ASUS
RAM  : 16 GB
Laptop menyala.
Laptop menjalankan program.
```

## Percobaan 1

Kode program Bike.

```
package JOBSHEET1;

public class Bike {
    private String brand;
    private int speed;
    private int gear=1;

    private final int[] GEAR_SPEED_LIMITS = {5, 10, 25, 30, 40, 60};

    public void setBrand(String brandName) {
        brand = brandName;
    }

    public void gearChanges(int gearValue) {
        if (gearValue < 1 || gearValue > 6) {
            System.out.println("Invalid gear value. Gear must be between 1 and 6.");
        }
        else {
            gear = gearValue;
        }
    }

    public int speedAcceleration(int increment) {
        speed += increment;
        if (speed >= GEAR_SPEED_LIMITS[gear - 1]) {
            speed = GEAR_SPEED_LIMITS[gear - 1];
        }
        return speed;
    }
    public int speedDeceleration(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
        return speed;
    }

    public void printInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed);
        System.out.println("Gear : " + gear);
    }
}


```
Kode program BikeDemo

```
package JOBSHEET1;

public class BikeDemo {
    public static void main(String[] args) {
        Bike mountainBike1 = new Bike();
        Bike mountainBike2 = new Bike();

        mountainBike1.setBrand("Trek");
        mountainBike1.speedAcceleration(10);
        mountainBike1.gearChanges(2);
        mountainBike1.printInfo();

        mountainBike2.setBrand("Giant");
        mountainBike2.speedAcceleration(20);
        mountainBike2.gearChanges(3);
        mountainBike2.printInfo();

    }
}

```
Hasil running.
```
Brand : Trek
Speed : 5
Gear : 2
Brand : Giant
Speed : 5
Gear : 3
```
## Percobaan 2
Kode program RoadBike

```
package JOBSHEET1;

public class RoadBike extends Bike {
     private int tireWidth;

    public void setTireWidth(int width) {
        tireWidth = width;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Tire Width : " + tireWidth + " mm");
        System.out.println("Bike Type : Road Bike");
    }
}


``` 
Kode Program BikeDemo modifikasi
```
package JOBSHEET1;

public class BikeDemo {
    public static void main(String[] args) {
        Bike mountainBike1 = new Bike();
        Bike mountainBike2 = new Bike();
        RoadBike roadBike1 = new RoadBike();

        mountainBike1.setBrand("Trek");
        mountainBike1.speedAcceleration(10);
        mountainBike1.gearChanges(2);
        mountainBike1.printInfo();

        mountainBike2.setBrand("Giant");
        mountainBike2.speedAcceleration(20);
        mountainBike2.gearChanges(3);
        mountainBike2.printInfo();

        roadBike1.setBrand("Specialized");
        roadBike1.setTireWidth(25);
        roadBike1.speedAcceleration(15);
        roadBike1.gearChanges(4);
        roadBike1.printInfo();
    }
}

```
Hasil Running
```
Brand : Trek
Speed : 5
Gear : 2
Brand : Giant
Speed : 5
Gear : 3
Brand : Specialized
Speed : 5
Gear : 4
Tire Width : 25 mm
Bike Type : Road Bike
```
