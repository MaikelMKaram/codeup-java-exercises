package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student student1 = new Student("Jack");
        student1.addGrade(100);
        student1.addGrade(90);
        student1.addGrade(90);

        Student student2 = new Student("Jim");
        student2.addGrade(90);
        student2.addGrade(80);
        student2.addGrade(80);

        Student student3 = new Student("James");
        student3.addGrade(80);
        student3.addGrade(70);
        student3.addGrade(70);

        Student student4 = new Student("John");
        student4.addGrade(70);
        student4.addGrade(60);
        student4.addGrade(60);

        students.put("Jack_n_Coke",student1);
        students.put("Jim_Bean",student2);
        students.put("James_on_Ice",student3);
        students.put("Johnny",student4);


    }
}
