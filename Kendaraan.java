public class Kendaraan {
    String plat;
    String tipe;
    String merk;

    public Kendaraan(String plat, String tipe, String merk) {
        this.plat = plat;
        this.tipe = tipe;
        this.merk = merk;
    }

    public void tampilkanInformasi() {
        System.out.println("Plat Nomor: " + plat);
        System.out.println("Tipe: " + tipe);
        System.out.println("Merk: " + merk);
    }

    public String getPlat() {
        return plat;
    }

    public String toString() {
        return "Plat Nomor: " + plat + "\nTipe: " + tipe + "\nMerk: " + merk;
    }
}