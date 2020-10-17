package ro.fastrackit.classroom;

import java.time.LocalDate;

public abstract class Professor implements Human{
    private String lastName;
    private String firstName;
    private LocalDate dateOfBirth;
    private LocalDate dateOfHiring;
    private String emailAddress;
    public Boolean isPhd;
    private Professor getType;

    void isPhd(){

    }

    public Professor getType(){
        return getType;
    }
}
