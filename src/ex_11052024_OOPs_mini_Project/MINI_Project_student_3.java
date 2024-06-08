package ex_11052024_OOPs_mini_Project;

public class MINI_Project_student_3 {

    // Create Object of 3 students and assign the values.

    public static void main(String[] args) {

        // Creating object of first student

        Student s1 = new Student ();
        s1.name = "Kapil";
        s1.height = 182.5;
        s1.eyecolour = "Brown";
        s1.age = 27;

        Course c1 = new Course ();
        c1.coursename = "Physics";
        c1.courseID = 123;
        c1.stream = "Science";

        Payment p1 = new Payment ();
        p1.amount = 2000;
        p1.modeofpayment = "cash";
        p1.paidBy = "Dad";

        s1.studentCourse = c1;
        s1.studentPayment = p1;

        s1.displayStudentInfo();

        // Creating object of Second student

        Student s2 = new Student ();
        s2.name = "Akki";
        s2.height = 182.5;
        s2.eyecolour = "Blue";
        s2.age = 29;

        Course c2 = new Course ();
        c2.coursename = "Chemistry";
        c2.courseID = 113;
        c2.stream = "Science";

        Payment p2 = new Payment ();
        p2.amount = 5000;
        p2.modeofpayment = "UPI";
        p2.paidBy = "Dad";

        s2.studentCourse = c2;
        s2.studentPayment = p2;

        s2.displayStudentInfo();

        // Creating object of third student

        Student s3 = new Student ();
        s3.name = "Akki";
        s3.height = 182.5;
        s3.eyecolour = "Blue";
        s3.age = 29;

        Course c3 = new Course ();
        c3.coursename = "Chemistry";
        c3.courseID = 113;
        c3.stream = "Science";

        Payment p3 = new Payment ();
        p3.amount = 5000;
        p3.modeofpayment = "UPI";
        p3.paidBy = "Dad";

        s3.studentCourse = c3;
        s3.studentPayment = p3;

        s3.displayStudentInfo();



    }
}
