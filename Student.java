
import java.util.Date;

public class Student extends Person {
    private String NIM;
    private double GPA;
    private String major;
    private String degree;
    private int graduationYear;

    public Student(String firstName, String middleName,
                   String lastName, Date dateOfBirth,
                   String NIM, double GPA, String major,
                   String degree, int graduationYear) {

        super(firstName, middleName, lastName, dateOfBirth);

        this.NIM = NIM;
        this.GPA = GPA;
        this.major = major;
        this.degree = degree;
        this.graduationYear = graduationYear;
    }

    public String getNIM() {
        return NIM;
    }

    public double getGPA() {
        return GPA;
    }

    public String getMajor() {
        return major;
    }

    public String getDegree() {
        return degree;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public void changeMajor(String newMajor) {
        this.major = newMajor;
    }

    public static double calculateAverageGPA(String... grades) {
        if (grades.length == 0) {
            return 0.0;
        }

        double total = 0;

        for (String grade : grades) {
            switch (grade.toUpperCase()) {
                case "A":  total += 4.0; break;
                case "A-": total += 3.67; break;
                case "B+": total += 3.33; break;
                case "B":  total += 3.0; break;
                case "B-": total += 2.67; break;
                case "C+": total += 2.33; break;
                case "C":  total += 2.0; break;
                case "D":  total += 1.0; break;
                case "F":  total += 0.0; break;
                default:
                    throw new IllegalArgumentException(
                        "Nilai tidak valid: " + grade
                    );
            }
        }

        return total / grades.length;
    }
}
