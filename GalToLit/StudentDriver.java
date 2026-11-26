public class StudentDriver {
    public static void main(String[] args) {
        // Membuat Object dari class Student
        Student student1 = new Student();

        // Mencetak informasi object ke layar
        System.out.println("Student Name: " + student1.fName + " " + student1.iName);
        System.out.println("Student ID: " + student1.stuId);
        System.out.println("Student Status: " + student1.stuStatus);
    }
}