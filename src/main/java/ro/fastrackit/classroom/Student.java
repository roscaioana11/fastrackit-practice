package ro.fastrackit.classroom;  //punctul 4
import java.time.LocalDate;
import java.util.Objects;

public class Student implements Human{
    // punctul 1
    public String lastName;
    public String firstName;
    public LocalDate dateOfBirth;
    public String emailAddress;
    private float grade;
    private Boolean hasFinishedClass;
    private StudentType studentType;


    public StudentType getType(){
        return studentType;
    }
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

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public Boolean getHasFinishedClass() {
        return hasFinishedClass;
    }

    public void setHasFinishedClass(Boolean finishedClass) {
        this.hasFinishedClass = finishedClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Float.compare(student.grade,grade) == 0 &&
                lastName.equals(student.lastName) &&
                firstName.equals(student.firstName) &&
                dateOfBirth.equals(student.dateOfBirth) &&
                Objects.equals(emailAddress,student.emailAddress) &&
                Objects.equals(hasFinishedClass,student.hasFinishedClass) &&
                studentType == student.studentType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName,firstName,dateOfBirth,emailAddress,grade,hasFinishedClass,studentType);
    }

    @Override
    public String toString() {
        return String.format("LastName %s FirstName: %s, DateOfBirth: %s\n",
                this.getLastName(),
                this.getFirstName(),
                this.getDateOfBirth());
    }
}
