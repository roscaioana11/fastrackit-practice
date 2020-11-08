package classroom.c7;

import ro.fastrackit.classroom.Human;
import ro.fastrackit.classroom.Student;
import ro.fastrackit.classroom.StudentType;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        List<? extends Human> humanList = createStudentList();
        System.out.println("ceva: " + humanList);

    }


    static List<Student> createStudentList(){
        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student("firstStudent"));
        student.add(new Student("secondStudent"));
        student.add(new Student("thirdStudent"));
        System.out.println("Something: " + student);
        return student;
    }

    <T extends Human> void printSomething(T geneticObj){
        System.out.println();
    }
}
