public class QueueTransaksi {
    Transaksi[] data;
    int front, rear, size;

    public QueueTransaksi(int kapasitas) {
        data = new Transaksi[kapasitas];
        front = rear = size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void enqueue(Transaksi t) {
        if (isFull()) {
            System.out.println(">> Antrian transaksi penuh!");
            return;
        }
        data[rear] = t;
        rear = (rear + 1) % data.length;
        size++;
    }

    public void tampilkanRiwayat() {
        if (isEmpty()) {
            System.out.println(">> Belum ada transaksi.");
            return;
        }
        System.out.println("Riwayat Transaksi --");
        System.out.println("Daftar Transaksi:");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % data.length;
            System.out.println(data[idx]);
        }
    }
}