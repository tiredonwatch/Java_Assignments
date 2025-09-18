class Student {
    String name;
    int roll_no;

    // Constructor to initialize name and roll_no
    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }
}

public class Student_info {
    public static void main(String[] args) {
        // Creating an object of Student class and assigning values
        Student student = new Student("John", 2);

        // Printing the values
        System.out.println("Roll no: " + student.roll_no);
        System.out.println("Name: " + student.name);
    }
}
