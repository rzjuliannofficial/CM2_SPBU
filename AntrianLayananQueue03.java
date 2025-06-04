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
            System.out.println("Antrian sudah penuh, tidak bisa menambahkan transaksi baru.");
            return;
        }
        rear = (rear + 1) % max;
        this.data[rear] = data;
        size++;
    }

    
}
