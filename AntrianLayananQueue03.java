public class AntrianLayananQueue03 {
    TransaksiPengisian03[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayananQueue03(int max) {
        this.max = max;
        this.data = new TransaksiPengisian03[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue( TransaksiPengisian03 data) {
        if (isFull()) {
            return;
        }
        rear = (rear + 1) % max;
        this.data[rear] = data;
        size++;
    }

    public void printRiwayatTransaksi() {
        if (isEmpty()) {
            System.out.println("Riwayat transaksi kosong.");
            return;
        }
        System.out.printf("%-15s %-15s\n", "Plat Nomor", "Total Bayar");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            data[index].TampilkanTranskasi();
        }
    }
}
