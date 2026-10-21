import java.util.Scanner;
public class tugasDua26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total=0;

        System.out.print("Input jenis kendaraan (1-Mobil, 2-Sepeda Motor, 0-Keluar): ");
        jenis = sc.nextInt();

        while (jenis != 0){
            if(jenis == 1|| jenis == 2){
                System.out.print("Input durasi parkir (dalam jam): ");
                durasi = sc.nextInt();

                if(jenis == 1){
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            }
            System.out.print("Input jenis kendaraan (1-Mobil, 2-Sepeda Motor, 0-Keluar): ");
            jenis = sc.nextInt();
        }
        System.out.println("Total biaya parkir: Rp " + total);
    }
}
