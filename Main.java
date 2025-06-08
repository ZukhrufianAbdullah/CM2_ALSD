import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKendaraan antrian = new AntrianKendaraan();
        QueueTransaksi transaksiQueue = new QueueTransaksi(100);
        BBM[] daftarBBM = {
            new BBM("Pertalite", 10000),
            new BBM("Pertamax", 13500),
            new BBM("Dexlite", 14000)
        };

        int pilihan;
        do {
            System.out.println("\n--- Menu SPBU ----");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    antrian.tambahAntrian();
                    break;
                case 2:
                    antrian.tampilAntrian();
                    break;
                case 3:
                    System.out.println(">> Jumlah kendaraan dalam antrian: " + antrian.hitungAntrian());
                    break;
                case 4:
                    antrian.layaniDenganTransaksi(transaksiQueue, daftarBBM);
                    break;
                case 5:
                    transaksiQueue.tampilkanRiwayat();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
} 