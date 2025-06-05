public class AntrianKendaraan {
    Node head;
    int jumlah = 0;

    public void tambahAntrian() {
        Kendaraan k = new Kendaraan();
        k.inputData();
        Node baru = new Node(k);
        if (head == null) {
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

    public Kendaraan layani() {
        if (head == null) return null;
        Kendaraan dilayani = head.data;
        head = head.next;
        jumlah--;
        return dilayani;
    }

    public void tampilAntrian() {
        if (head == null) {
            System.out.println(">> Tidak ada kendaraan dalam antrian.");
            return;
        }
        System.out.println("Antrian Kendaraan:");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int hitungAntrian() {
        return jumlah;
    }

    public void layaniDenganTransaksi(QueueTransaksi transaksiQueue, BBM[] daftarBBM) {
        Kendaraan k = layani();
        if (k == null) {
            System.out.println(">> Tidak ada kendaraan dalam antrian.");
            return;
        }
        System.out.println("Petugas melayani " + k.platNomor);
        Transaksi t = new Transaksi();
        t.inputTransaksi(k.platNomor); 
        transaksiQueue.enqueue(t);
        System.out.println(">> Transaksi berhasil dicatat.");
    }
}
