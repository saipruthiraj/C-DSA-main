class Student {
    int rollno, mark;
    String name;

    // Constructor for initializing Student objects
    Student(int rollno, int mark, String name) {
        this.rollno = rollno;
        this.mark = mark;
        this.name = name;
    }
  
    // Method to display student details
    void display() {
        System.out.println("Roll No: " + rollno + ", Name: " + name + ", Marks: " + mark);
    }
}

public class ArrayObject {

    public static void main(String args[]) {
        // Creating student objects with different data
        Student s1 = new Student(12, 322, "SAI");
        Student s2 = new Student(15, 298, "RAHUL");
        Student s3 = new Student(18, 305, "ANITA");
        Student s4 = new Student(20, 310, "MEERA");

        // Creating an array of Student objects
        Student[] students = new Student[4];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;

        // Loop to print student details
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}
