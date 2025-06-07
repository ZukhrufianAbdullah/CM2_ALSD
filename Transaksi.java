import java.util.Scanner;

public class Transaksi {
    String platNomor;
    String jenisBBM;
    double hargaPerLiter;
    double liter;

    public void inputTransaksi(String plat) {
        Scanner sc = new Scanner(System.in);
        this.platNomor = plat;

        System.out.print("Masukkan Jenis BBM: ");
        jenisBBM = sc.nextLine();

        System.out.print("Masukkan Harga per liter: ");
        hargaPerLiter = sc.nextDouble();

        System.out.print("Masukkan Jumlah liter: ");
        liter = sc.nextDouble();
    }

    public double totalBayar() {
        return hargaPerLiter * liter;
    }

    public String toString() {
        return platNomor + ": Rp " + totalBayar();
    }
}
