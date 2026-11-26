import java.util.Scanner;

public class PerjalananSekolah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah orang yang mendaftar: ");
        int jumlahOrang = input.nextInt();

        int kapasitasBus = 45;

        // Menghitung jumlah bus penuh yang dibutuhkan
        int jumlahBus = jumlahOrang / kapasitasBus;

        // Menghitung sisa orang yang harus naik van
        int jumlahOrangNaikVan = jumlahOrang % kapasitasBus;

        System.out.println("Jumlah bus yang diperlukan: " + jumlahBus);
        System.out.println("Total orang yang harus naik van: " + jumlahOrangNaikVan);

        input.close();
    }
}