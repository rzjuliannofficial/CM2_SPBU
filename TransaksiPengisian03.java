public class TransaksiPengisian03 {
    Kendaraan03 kendaraan;
    BBM03 bbm;
    double liter;
    double totalBayar;

    public TransaksiPengisian03(Kendaraan03 kendaraan, BBM03 bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = bbm.hargaPerliter * liter;
    }
}
