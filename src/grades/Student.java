package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public static void main(String[] args) {
        Student Student1 = new Student("Student1");
        Student1.addGrade(70);
        Student1.addGrade(80);
        System.out.println("Student1.getGradeAverage() = " + Student1.getGradeAverage());
    }

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        int total = 0;
        for(int i = 0; i < grades.size(); i++){
            total += grades.get(i);
        } return total/grades.size();
    }
}
