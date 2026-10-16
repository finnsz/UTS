package UTS;

public class Bengkel {
    private String nama;
    private BayServis[] bayServis;
    private Mekanik kepala;

    public Bengkel(String nama, int jumlahBay) {
        if (jumlahBay <= 0) {
            jumlahBay = 1;
        }
        this.nama = nama;
        this.bayServis = new BayServis[jumlahBay];
        for (int i = 0; i < jumlahBay; i++) {
            this.bayServis[i] = new BayServis(i + 1);
        }
    }

    public void setKepala(Mekanik kepala) {
        if (kepala == null) {
            return;
        }
        this.kepala = kepala;
    }

    public void terimaServis(Servis servis) {
        if (servis == null) {
            return;
        }
        for (int i = 0; i < bayServis.length; i++) {
            if (bayServis[i] != null && bayServis[i].isKosong()) {
                bayServis[i].terima(servis);
                return;
            }
        }
    }

    public void terimaServis(Servis servis, int nomorBay) {
        if (servis == null || nomorBay < 1 || nomorBay > bayServis.length) {
            return;
        }
        int i = nomorBay - 1;
        if (bayServis[i] != null && bayServis[i].isKosong()) {
            bayServis[i].terima(servis);
        }
    }

    public Servis selesaikan(int nomorBay) {
        if (nomorBay < 1 || nomorBay > bayServis.length) {
            return null;
        }
        int i = nomorBay - 1;
        if (bayServis[i] == null) {
            return null;
        }
        return bayServis[i].selesai();
    }

    public void tampilInfo() {
        String namaKepala;
        if (kepala != null) {
            namaKepala = kepala.getNama();
        } else {
            namaKepala = "-";
        }
        System.out.println("bengkel " + nama + " (kepala: " + namaKepala + ")");

        for (int i = 0; i < bayServis.length; i++) {
            if (bayServis[i] == null) {
                continue;
            }

            String status;
            if (bayServis[i].isKosong()) {
                status = "Kosong";
            } else {
                status = bayServis[i].getServis().getPlatNomor();
            }
            System.out.print("bay " + bayServis[i].getNomor() + ": " + status);

            if (i < bayServis.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();
    }
}