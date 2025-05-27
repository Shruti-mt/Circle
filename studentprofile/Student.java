public class Student {

    String name;
    int usn;
    String course;

    Student(String name, int usn, String course) {
        this.name = name;
        this.usn = usn;
        this.course = course;

    }

    public void display() {
        System.out.println("Student details: ");
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("Course: " + course);

    }

    public static void main(String[] args) {
        Student s1 = new Student("Amrut", 0123, "AIDS");
        Student s2 = new Student("Komal", 1234, "BCA");

        s1.display();
        s2.display();
    }
}