package ro.fastrackit.classroom.c7;

import ro.fastrackit.classroom.Human;
import ro.fastrackit.classroom.Student;
import ro.fastrackit.classroom.StudentType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        List<? extends Human> humanList = createStudentList();
        ArrayList<Human> firstHuman = new ArrayList<Human>();
        ArrayList<Human> secondHuman = new ArrayList<Human>();
        ArrayList<Human> thirdHuman = new ArrayList<Human>();


        /*
        Human firstHuman = (Human) new ArrayList<Human>();
        Human secondHuman = (Human) new ArrayList<Human>();
        Human thirdHuman = (Human) new ArrayList<Human>();
        */


        System.out.println("ceva: " + humanList);

    }

    static List<Student> createStudentList(){
        ArrayList<Student> student = new ArrayList<Student>();
        Student firstStudent = new Student("Rosca","Ioana", LocalDate.of(1995,9,11));
        Student secondStudent = new Student("Ifrim","Iulia",LocalDate.of(1995,10,24));
        Student thirdStudent = new Student("Pop","Adriana",LocalDate.of(1995,9,2));
        student.add(firstStudent);
        student.add(secondStudent);
        student.add(thirdStudent);
        System.out.println("Students: " + student);
        return student;
    }

    <T extends Human> void printHuman(T genericObj){
        System.out.println();
    }
}
