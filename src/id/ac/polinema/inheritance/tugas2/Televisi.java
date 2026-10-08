package src.id.ac.polinema.inheritance.tugas2;

public class Televisi {
    protected String merk;
    protected int jumlahChannel;

    private int channelAktif;

    public Televisi(
        String merk,
        int jumlahChannel
    ) {
        this.merk = merk;
        this.jumlahChannel = jumlahChannel;

        channelAktif = 1;
    }

    public int getChannelAktif() {
        return channelAktif;
    }

    public void pindahChannel(int channel) {

        if (channel >= 1 &&
            channel <= jumlahChannel) {
        channelAktif = channel;
        }
    }

    public void gantiModusTampilan(String modus) {

        System.out.println(
            "Modus tampilan: " + modus
        );
    }
}
