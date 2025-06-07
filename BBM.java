public class BBM {
    String nama;
    int harga;

    public BBM(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String toString() {
        return nama + " - Rp" + harga + "/L";
    }

}
