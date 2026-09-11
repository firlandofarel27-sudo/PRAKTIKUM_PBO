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
