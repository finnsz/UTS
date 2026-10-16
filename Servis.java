package UTS;

public abstract class Servis {
    protected String kode;
    protected String platNomor;
    protected int biayaJasa;
    private Mekanik mekanikPJ;

    public Servis(String kode, String platNomor, int biayaJasa) {
        this.kode = kode;
        this.platNomor = platNomor;
        this.biayaJasa = biayaJasa;
    }

    public void setMekanikPJ(Mekanik mekanikPJ) {
        if (mekanikPJ == null) {
            return;
        }
        this.mekanikPJ = mekanikPJ;
    }

    public Mekanik getMekanikPJ() {
        return mekanikPJ;
    }

    public String getKode() {
        return kode;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public int hitungbiaya() {
        return biayaJasa;
    }

    public String getJenis() {
        return "";
    }
}