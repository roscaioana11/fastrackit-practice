package ro.fastrackit.classroom;

import java.time.LocalDate;

public class Professor {
    private String lastName;
    private String firstName;
    private LocalDate dateOfBirth;
    private LocalDate dateOfHiring;
    private String emailAddress;
    public Boolean isPhd;

    void isPhd(){

    }
}

class PhdProfessor extends Professor{
    @Override
    void isPhd() {
        super.isPhd();
    }
}