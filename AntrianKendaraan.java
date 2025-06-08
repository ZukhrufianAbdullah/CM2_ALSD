import java.util.Scanner;

public class AntrianKendaraan {
    Node head;
    int jumlah = 0;
    Scanner sc = new Scanner(System.in);

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian() {
        System.out.print("Masukkan Plat Nomor: ");
        String plat = sc.nextLine();
        System.out.print("Masukkan Jenis Kendaraan: ");
        String tipe = sc.nextLine();
        System.out.print("Masukkan Merk: ");
        String merk = sc.nextLine();

        Kendaraan k = new Kendaraan(plat, tipe, merk);
        Node baru = new Node(k);
        if (isEmpty()) {
            head = baru;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = baru;
        }
        jumlah++;
        System.out.println(">> Kendaraan masuk ke dalam antrian.");
    }

    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println(">> Tidak ada kendaraan dalam antrian.");
            return;
        }
        System.out.println("Antrian Kendaraan:");
        Node temp = head;
        while (temp != null) {
            temp.data.tampilkanInformasi();
            System.out.println("----------------------");
            temp = temp.next;
        }
    }

    public int hitungAntrian() {
        return jumlah;
    }

    public Kendaraan layani() {
        if (isEmpty()) return null;
        Kendaraan dilayani = head.data;
        head = head.next;
        jumlah--;
        return dilayani;
    }
    
   public void layaniDenganTransaksi(QueueTransaksi transaksiQueue, BBM[] daftarBBM) {
    Kendaraan k = layani();
    if (k == null) {
        System.out.println(">> Tidak ada kendaraan dalam antrian.");
        return;
    }

    System.out.println("Petugas melayani " + k.plat);

    System.out.print("Masukkan Jenis BBM: ");
    String namaBBM = sc.nextLine();
    System.out.print("Masukkan Harga per liter: ");
    double harga = sc.nextDouble();
    sc.nextLine();
    System.out.print("Masukkan Jumlah liter: ");
    double liter = sc.nextDouble();
    sc.nextLine();

    BBM bbm = new BBM(namaBBM, harga);

    TransaksiPengisian t = new TransaksiPengisian(k, bbm, liter);
    transaksiQueue.enqueue(t);
    System.out.println(">> Transaksi berhasil dicatat.");
    
    }
}