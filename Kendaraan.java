import java.util.Scanner;

public class Kendaraan {
    String platNomor;
    String jenisKendaraan;
    String merk;

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Plat Nomor: ");
        platNomor = sc.nextLine();
        System.out.print("Masukkan Jenis Kendaraan: ");
        jenisKendaraan = sc.nextLine();
        System.out.print("Masukkan Merk: ");
        merk = sc.nextLine();
    }

    public String toString() {
        return "Plat Nomor: " + platNomor + "\nTipe: " + jenisKendaraan + "\nMerk: " + merk;
    }
}
