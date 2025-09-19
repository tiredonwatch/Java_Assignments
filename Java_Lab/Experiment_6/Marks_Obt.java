abstract class Marks {
    protected String studentName;
    protected int[] marks;

    Marks(String studentName, int... marks) {
        this.studentName = studentName;
        this.marks = marks;
    }

    abstract double getPercentage();
}

class A extends Marks {
    A(String studentName, int m1, int m2, int m3) {
        super(studentName, m1, m2, m3);
    }

    @Override
    double getPercentage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / 3.0;
    }
}

class B extends Marks {
    B(String studentName, int m1, int m2, int m3, int m4) {
        super(studentName, m1, m2, m3, m4);
    }

    @Override
    double getPercentage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / 4.0;
    }
}

public class Marks_Obt {
    public static void main(String[] args) {
        Marks[] students = {
            new A("Student A", 85, 90, 80),
            new B("Student B", 75, 88, 92, 85)
        };

        for (Marks student : students) {
            System.out.println(student.studentName + " Percentage: " + student.getPercentage() + "%");
        }
    }
}
