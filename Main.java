package UTS;

public class Main {
    public static void main(String[] args) {
        Bengkel bengkel = new Bengkel("jaya motor", 3);
        Mekanik pakSlamet = new Mekanik("pak selamet", "Mesin");
        bengkel.setKepala(pakSlamet);

        Mekanik masDodi = new Mekanik("mas dodi", "Kelistrikan");

        ServisRingan s1 = new ServisRingan("srv-01", "N 1234 AA", 50000);
        ServisBerat s2 = new ServisBerat("srv-02", "N 4321 BB", 200000, 450000);

        s1.setMekanikPJ(masDodi);
        s2.setMekanikPJ(masDodi);

        bengkel.terimaServis(s1);
        bengkel.terimaServis(s2, 3);
        bengkel.tampilInfo();

        Servis selesai = bengkel.selesaikan(1);

        NotaPrinter printer = new NotaPrinter("Thermal Printer");
        printer.cetakNota(selesai);
        printer.cetakNota(s2);

        System.out.println();
        bengkel.tampilInfo();
    }
}