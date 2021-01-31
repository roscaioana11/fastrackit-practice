package org.fasttrackit.trainingspring.model.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column private  String firstName;
    @Column private  String lastName;
    @Column private Date dateOfBirth;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "grantedTo")
    private ScholarshipEntity scholarship;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ExamResultEntity> results;

    @ManyToMany(mappedBy = "students")
    private List<CourseEntity> courses;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ScholarshipEntity getScholarship() {
        return scholarship;
    }

    public void setScholarship(ScholarshipEntity scholarship) {
        this.scholarship = scholarship;
    }

    public List<ExamResultEntity> getResults() {
        return results;
    }

    public void setResults(List<ExamResultEntity> results) {
        this.results = results;
    }

    public List<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseEntity> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
