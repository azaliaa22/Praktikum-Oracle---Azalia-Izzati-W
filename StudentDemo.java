
import java.util.Date;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student(
            "Azalia",
            "Izzati",
            "Wulandari",
            new Date(105, 0, 1),
            "12345",
            3.75,
            "Informatika",
            "Sarjana",
            2028
        );

        System.out.println("Nama: " + student.getName());
        System.out.println("NIM: " + student.getNIM());
        System.out.println("IP: " + student.getGPA());
        System.out.println("Jurusan: " + student.getMajor());
        System.out.println("Gelar: " + student.getDegree());
        System.out.println("Tahun kelulusan: "
                + student.getGraduationYear());

        student.changeMajor("Sistem Informasi");
        System.out.println("Jurusan baru: " + student.getMajor());

        double average = Student.calculateAverageGPA(
            "A", "B+", "B", "A-"
        );

        System.out.printf("IP rata-rata: %.2f%n", average);
    }
}
