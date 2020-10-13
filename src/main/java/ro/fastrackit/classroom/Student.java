package ro.fastrackit.classroom;  //punctul 4
import java.time.LocalDate;

public class Student extends Human{
    // punctul 1
    private String lastName;
    private String firstName;
    private LocalDate dateOfBirth;
    private String emailAddress;
    private Float grade;
    private Boolean finishedClass;

    //punctul 2
    public Student(String lastName, String firstName, LocalDate dateOfBirth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
    }

    //punctul 3

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    public Boolean getFinishedClass() {
        return finishedClass;
    }

    public void setFinishedClass(Boolean finishedClass) {
        this.finishedClass = finishedClass;
    }

}
