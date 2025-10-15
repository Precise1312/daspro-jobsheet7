import java.util.Scanner;

public class tiketBioskop10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hargaTiket = 50000;
        int totalJumlah = 0;
        double diskon1 = 0.10;
        double diskon2 = 0.15;
        double totalTerjual = 0;
        String i;
        int jumlahTiket;

        System.out.println("ketik 'Hari ini' jika mau memulai pendataan tiket");
        i = sc.nextLine();

        if (i.equalsIgnoreCase("Hari ini")) {
            while (i.equalsIgnoreCase("Hari ini") || i.equalsIgnoreCase("ya")) {
                System.out.println("Masukkan Jumlah Tiket");
                jumlahTiket = sc.nextInt();
                if (jumlahTiket < 0) {
                    System.out.println("jumlah tiket tidak valid, diharapkan mengisi kembali");
                    continue;
                } else if (jumlahTiket > 0 && jumlahTiket < 5) {
                    totalTerjual = totalTerjual + (jumlahTiket * hargaTiket);
                    totalJumlah = totalJumlah + jumlahTiket;
                    sc.nextLine();
                    System.out.println("Apakah masih hari yang sama? ya/tidak");
                    i = sc.nextLine();
                } else if (jumlahTiket > 4 && jumlahTiket < 11) {
                    totalTerjual = totalTerjual + ((jumlahTiket * hargaTiket) * (1 - diskon1));
                    System.out.println(1 - diskon1);
                    totalJumlah = totalJumlah + jumlahTiket;
                    sc.nextLine();
                    System.out.println("Apakah masih hari yang sama? ya/tidak");
                    i = sc.nextLine();
                } else {
                    totalTerjual = totalTerjual + ((jumlahTiket * hargaTiket) * (1 - diskon2));
                    totalJumlah = totalJumlah + jumlahTiket;
                    sc.nextLine();
                    System.out.println("Apakah masih hari yang sama? ya/tidak");
                    i = sc.nextLine();
                }
            }
        }
        System.out.println("pendataan hari ini telah selesai");
        System.out.println("total tiket terjual: " + totalJumlah);
        System.out.println("total harga penjualan tiket: " + totalTerjual);

    }
}