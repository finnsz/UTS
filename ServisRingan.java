package UTS;

public class ServisRingan extends Servis {
    private int hargaSukuCadang = 60000;

    public ServisRingan(String kode, String platNomor, int biayaJasa) {
        super(kode, platNomor, biayaJasa);
    }

    @Override
    public int hitungbiaya() {
        return biayaJasa + hargaSukuCadang;
    }

    @Override
    public String getJenis() {
        return "ringan";
    }
}