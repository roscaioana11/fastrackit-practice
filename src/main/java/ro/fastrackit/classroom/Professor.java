package ro.fastrackit.classroom;

import java.time.LocalDate;
class Professor implements Human{
    private String lastName;
    private String firstName;
    private LocalDate dateOfBirth;
    private LocalDate dateOfHiring;
    private String emailAddress;
    public Boolean isPhd;
    private ProfessorType professorType;

    void isPhd(){

    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    public ProfessorType getType(){
        return professorType;
    }
}
