package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student Student1 = new Student("Student1");
        Student1.addGrade(70);
        Student1.addGrade(80);
        System.out.println("Student1.getGradeAverage() = " + Student1.getGradeAverage());
    }
}
