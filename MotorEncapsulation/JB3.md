|  | Pemrograman Berbasis Objek |
|--|--|
| NIM |  254107020031|
| Nama |  Farel Firlando |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/firlandofarel27-sudo/PRAKTIKUM_PBO) |

## Kode Program Praktikum!
# Tugas!
1. Getter adalah method untuk mengambil/membaca nilai dari suatu atribut.
Setter adalah method untuk mengubah/memberikan nilai pada suatu atribut.
2. Method getSimpanan() digunakan untuk mengambil atau mendapatkan nilai simpanan/saldo dari suatu objek.
3. Method yang digunakan untuk menambah saldo adalah tambahSimpanan() (jika sesuai dengan program/jobsheet yang digunakan).
4. Konstruktor adalah method khusus yang otomatis dijalankan ketika sebuah objek dibuat. Biasanya digunakan untuk memberikan nilai awal pada atribut objek.
5. Aturannya:
Nama konstruktor harus sama dengan nama class.
Tidak memiliki tipe data kembalian (void juga tidak boleh).
Dapat memiliki parameter atau tidak.
Dapat memiliki access modifier seperti public, protected, atau private.
Akan dipanggil secara otomatis saat objek dibuat dengan new.
6. Boleh. Konstruktor dapat dibuat private, biasanya untuk membatasi pembuatan objek dari luar class, misalnya pada pola Singleton.
7. 
```Mahasiswa mhs = new Mahasiswa("Farel", 123);
```
8. 
```
int saldo = 100000;
Mahasiswa mhs = new Mahasiswa();
```
9. Method didefinisikan/dideklarasikan di dalam class.
Method dipanggil (invocation) melalui objek atau class untuk menjalankan fungsinya.
```
public void tampilkanNama() {
    System.out.println("Farel");
}
```

```
mhs.tampilkanNama();
```
# Percobaan 1!
Kode Motor
```
package MotorEncapsulation;

public class motor {
    public int kecepatan = 0;
    public boolean kontakOn = false;

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak ON");
        }
        else {
            System.out.println("Kontak OFF");
        }
        System.out.println("Kecepatan"+ kecepatan+"\n");
    }
}

```
Kode Motor Demo
```
package MotorEncapsulation;

public class motorDemo {
    public static void main(String[]args) {
        motor motor = new motor();
        motor.printStatus();
        motor.kecepatan = 50;
        motor.printStatus();
    }
}

```
# Percobaan 2!
Kode Motor Modifikasi
```
package MotorEncapsulation;

public class motor {
    public int kecepatan = 0;
    public boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if(kontakOn == true){
            kecepatan += 5;
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena mesin OFF! \n");
        }
    }
    public void kurangiKecepatan(){
        if(kontakOn == true){
            kecepatan -= 5;
        }
        else{
            System.out.println("Kecepatan tidak bisa berkurang karena mesin OFF! \n");
        }
    }
    public void printStatus(){
        if (kontakOn == true) {
            System.out.println("Kontak ON");
        }
        else{
            System.out.println("Kontak OFF");
        }
    }
}

```
Kode Motor Demo Modifikasi
```
package MotorEncapsulation;

public class motorDemo {
    public static void main(String[]args) {
        motor motor = new motor();
        motor.printStatus();
        motor.tambahKecepatan();

        motor.nyalakanMesin();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.matikanMesin();
        motor.printStatus();
    }
}

```
Hasil Running
```
Kontak OFF
Kecepatan tidak bisa bertambah karena mesin OFF! 

Kontak ON
Kontak ON
Kontak ON
Kontak ON
Kontak OFF

```
# Percobaan 3!
Kode Anggota
```
package KoperasiGetterSetter;

public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public float getSimpanan(){
        return simpanan;
    }
    public void setor(float uang){
        simpanan +=uang;
    }
    public void pinjam(float uang){
        simpanan -=uang;
    }
}

```
Kode KoperasiDemo
```
package KoperasiGetterSetter;

public class KoperasiDemo {
    public static void main(String[] args){
        Anggota anggota1 = new Anggota();
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Soekarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan" +anggota1.getNama()+ " : Rp "+anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan" +anggota1.getNama()+ " : Rp "+anggota1.getSimpanan());
    }
}

```
Hasil Running
```
SimpananIwan Setiawan : Rp 100000.0
SimpananIwan Setiawan : Rp 95000.0

```
# Percobaan 4!
Kode Anggota percobaan 4
```
package KoperasiGetterSetter;

public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;

    Anggota(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public float getSimpanan(){
        return simpanan;
    }
    public void setor(float uang){
        simpanan +=uang;
    }
    public void pinjam(float uang){
        simpanan -=uang;
    }
}

```
Kode Koperasi Demo Percobaan 4
```
package KoperasiGetterSetter;

public class KoperasiDemo {
    public static void main(String[] args){
        Anggota anggota1 = new Anggota("Iwan","Jalan Mawar");
        System.out.println("Simpanan" +anggota1.getNama()+ " : Rp "+anggota1.getSimpanan());
        
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Soekarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan" +anggota1.getNama()+ " : Rp "+anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan" +anggota1.getNama()+ " : Rp "+anggota1.getSimpanan());
    }
}

```
Hasil Running
```
SimpananIwan : Rp 0.0
SimpananIwan Setiawan : Rp 100000.0
SimpananIwan Setiawan : Rp 95000.0

```