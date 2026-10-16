package UTS_PBO;

public class Main {
    public static void main(String[] args) {
        Senjata pedang = new Senjata("Pedang Baja", 8);
        Senjata tongkat = new Senjata("Tongkat Api", 6);

        Prajurit arga = new Prajurit("Arga", 100, 12);
        Penyihir luna = new Penyihir("Luna", 80, 7, 30);
        arga.pasangSenjata(pedang);
        luna.pasangSenjata(tongkat);

        System.out.println(arga.info());
        System.out.println(luna.info());
        System.out.println("Damage Arga: " + arga.hitungDamage());

        Arena arena = new Arena();
        String pemenang = arena.duel(arga, luna);
        System.out.println("Pemenang: " + pemenang);
    }
}


/// JAWABAN NOMOR 3 
/// - Bagian Karakter yang saya gunakan adalah terimaDamage karena dari situ damage akan terinput atau dihitung.
/// - Hitung damage akan di override
/// - Tidak karena rumusnya berbeda dan menggunakan if else 
