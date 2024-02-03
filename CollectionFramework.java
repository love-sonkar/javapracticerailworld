import java.util.ArrayList;

public class CollectionFramework {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(); // normal list
        list.add(33);
        System.out.println(list);

        Student mohan = new Student("mohan", 44.33);
        Student sohan = new Student("sohan", 48.00);
        Student happy = new Student("happy ji ", 99.00);
        Student monu = new Student("monu", 9000);
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(mohan);
        studentList.add(sohan);
        studentList.add(1, happy);
        studentList.add(monu);

        for (Student st : studentList) {
            System.out.print("Name : " + st.name);
            System.out.print(" Marks : " + st.marks);
            System.out.println();
        }
    }
}

class Student {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
}
