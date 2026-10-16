package UTS;

public class BayServis {
    private int nomor;
    private Servis servis;

    public BayServis(int nomor) {
        this.nomor = nomor;
    }

    public void terima(Servis servis) {
        if (servis == null) {
            return;
        }
        this.servis = servis;
    }

    public Servis selesai() {
        Servis temp = this.servis;
        this.servis = null;
        return temp;
    }

    public boolean isKosong() {
        return servis == null;
    }

    public Servis getServis() {
        return servis;
    }

    public int getNomor() {
        return nomor;
    }
}