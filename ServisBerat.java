package UTS;

public class ServisBerat extends Servis {
    private int hargaSukuCadang;

    public ServisBerat(String kode, String platNomor, int biayaJasa, int hargaSukuCadang) {
        super(kode, platNomor, biayaJasa);
        this.hargaSukuCadang = hargaSukuCadang;
    }

    @Override
    public int hitungbiaya() {
        return biayaJasa + hargaSukuCadang;
    }

    @Override
    public String getJenis() {
        return "berat";
    }
}