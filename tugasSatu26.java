import java.util.Scanner;

public class tugasSatu26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int jumlahPelanggan, jumlahTiket;
        int totalTiket = 0;
        double totalPenjualan = 0;

        System.out.print("Masukkan jumlah pelanggan hari ini: ");
        jumlahPelanggan = sc.nextInt();

        for (int i = 1; i <= jumlahPelanggan; i++) {
            do {
                System.out.print("Masukkan jumlah tiket pelanggan ke-" + i + ": ");
                jumlahTiket = sc.nextInt();

                if (jumlahTiket < 0) {
                    System.out.println("Jumlah tiket tidak valid. Masukkan ulang.");
                }
            } while (jumlahTiket < 0);

            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            totalTiket += jumlahTiket;
            totalPenjualan += jumlahTiket * hargaTiket * (1 - diskon);
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan tiket: Rp " + (long) totalPenjualan);
    }
}