package reperence;

public class Student {

    int studentId;
    String studentName;

    Subject korea;
    Subject math;

    public Student(int id, String name){
        studentId = id;
        studentName = name;

        korea = new Subject();
        math = new Subject();
    }

    public void setSubject(String name, int score, String Type){
        if(Type.equals("math")){
            math.subjectName = name;
            math.score = score;
        }else if (Type.equals("korea")){
            korea.subjectName = name;
            korea.score = score;
        }
    }

    public void showStudentScore(){
        int total = korea.score + math.score;
        System.out.println("total = " + total);
    }

}
