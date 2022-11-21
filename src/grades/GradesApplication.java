package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void getGrades(){
        HashMap<String, Student> students = new HashMap<>();
        Student students1 = new Student("Jack");
        Student students2 = new Student("Jim");
        Student students3 = new Student("James");
        Student students4 = new Student("John");
        students1.addGrade(100);
        students1.addGrade(90);
        students1.addGrade(90);
        students2.addGrade(90);
        students2.addGrade(80);
        students2.addGrade(80);
        students3.addGrade(80);
        students3.addGrade(70);
        students3.addGrade(70);
        students4.addGrade(70);
        students4.addGrade(60);
        students4.addGrade(60);
    }
}
