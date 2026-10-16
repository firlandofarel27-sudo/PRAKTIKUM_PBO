package UTS_PBO;

public class Senjata {
    private String nama;
    private int Bonusdamage;

    public Senjata (String nama, int Bonusdamage){
        this.nama = nama;
        this.Bonusdamage = Bonusdamage;
    }
    public String getNama() {
        return nama;
    }
    public int getBonusdamage() {
        return Bonusdamage;
    }
}
