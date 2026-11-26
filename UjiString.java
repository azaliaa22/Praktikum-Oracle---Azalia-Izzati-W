public class UjiString {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = new String("DEF");
        String s3 = "AB" + "C";

        // a. s1.compareTo(s2)
        // Membandingkan "ABC" dengan "DEF" secara alfabetis (A - D = -3)
        System.out.println("a. s1.compareTo(s2) : " + s1.compareTo(s2)); 
        // Output: -3

        // b. s2.equals(s3)
        // Membandingkan isi "DEF" dengan "ABC"
        System.out.println("b. s2.equals(s3)    : " + s2.equals(s3)); 
        // Output: false

        // c. s3 == s1
        // Membandingkan referensi memori (keduanya merujuk ke String Pool "ABC")
        System.out.println("c. s3 == s1         : " + (s3 == s1)); 
        // Output: true

        // d. s2.compareTo(s3)
        // Membandingkan "DEF" dengan "ABC" (D - A = 3)
        System.out.println("d. s2.compareTo(s3) : " + s2.compareTo(s3)); 
        // Output: 3

        // e. s3.equals(s1)
        // Membandingkan nilai/teks "ABC" dengan "ABC"
        System.out.println("e. s3.equals(s1)    : " + s3.equals(s1)); 
        // Output: true
    }
}