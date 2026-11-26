public class StudentDriver {

    public static void main(String[] args) {

        Student student1 = new Student();

        System.out.println("Student Name: "
                + student1.fName + " " + student1.lName);

        System.out.println("Student ID: " + student1.stuId);

        System.out.println("Student Status: " + student1.stuStatus);
    }
}