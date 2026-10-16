package UTS;

public class NotaPrinter {
    private String model;

    public NotaPrinter(String model) {
        this.model = model;
    }

    public void cetakNota(Servis servis) {
        if (servis == null) {
            return;
        }
        String namaPJ;
        if (servis.getMekanikPJ() != null) {
            namaPJ = servis.getMekanikPJ().getNama();
        } else {
            namaPJ = "-";
        }
        System.out.println("nota [" + servis.getJenis() + "] " + servis.getKode() + " " + servis.getPlatNomor());
        System.out.println("pj: " + namaPJ);
        System.out.println("total: " + servis.hitungbiaya());
    }
}