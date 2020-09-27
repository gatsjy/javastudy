package array;

import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;
    ArrayList<Subject> subjectArrayList;

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;

        subjectArrayList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score){
        this.subjectArrayList.add(new Subject(name, score));
    }

    public void showStudentInfo(){
        int total = 0;
        for(Subject subject : subjectArrayList){
            total += subject.getScore();
            System.out.println("studentName + subject.getName() + subject.getScore() = " + studentName + subject.getName() + subject.getScore());
        }

        System.out.println("total = " + total);
    }
}
