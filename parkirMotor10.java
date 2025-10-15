import java.util.Scanner;

public class parkirMotor10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;
        do {
            System.out.println("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar)");

            jenis = sc.nextInt();
            System.out.println("Masukkan durasi: ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                total = total + 12500;
            } else if (jenis == 1) {
                total = total + (durasi * 3000);
            } else if (jenis == 2) {
                total += durasi * 2000;
                } else if (jenis > 2) {
                    System.out.println("input tidak valid, harap ulangi lagi");
                    continue;
                } else {

                }
            }

            while (jenis != 0);
            System.out.println("perhitungan selesai");
            System.err.println("Total Pembayaran parkir adalah: " + total);

        }
    }