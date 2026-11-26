public class GabungString {
    public static void main(String[] args) {
        // Deklarasi dan instansiasi dua object String terpisah
        String str1 = "Halo, ";
        String str2 = "Selamat Datang!";

        // Menggabungkan kedua String dan menetapkannya ke object String ketiga
        String str3 = str1 + str2;

        // Menampilkan hasil penggabungan
        System.out.println("String Pertama : " + str1);
        System.out.println("String Kedua   : " + str2);
        System.out.println("Hasil Gabungan : " + str3);
    }
}