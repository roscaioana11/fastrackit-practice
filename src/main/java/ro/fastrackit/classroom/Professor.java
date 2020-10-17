package ro.fastrackit.classroom;

import java.time.LocalDate;

public abstract class Professor implements Human{
    private String lastName;
    private String firstName;
    private LocalDate dateOfBirth;
    private LocalDate dateOfHiring;
    private String emailAddress;
    public Boolean isPhd;
    private ProfessorType professorType;

    void isPhd(){

    }

    public ProfessorType getType(){
        return professorType;
    }
}
