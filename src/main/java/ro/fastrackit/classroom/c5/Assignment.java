package ro.fastrackit.classroom.c5;

import java.util.Objects;
import java.util.UUID;

public class Assignment {
    UUID uniqueID; //fields
    int courseNumber;
    String assignmentTitle;
    String assignmentDescription;
    String difficultyLevel;


    public Assignment(UUID uniqueID, int courseNumber, String assignmentTitle, String assignmentDescription, String difficultyLevel) { //constructor
        this.uniqueID = uniqueID;
        this.courseNumber = courseNumber;
        this.assignmentTitle = assignmentTitle;
        this.assignmentDescription = assignmentDescription;
        this.difficultyLevel = difficultyLevel;
    }

    public UUID getUniqueID() {
        return uniqueID;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public String getAssignmentTitle() {
        return assignmentTitle;
    }

    public String getAssignmentDescription() {
        return assignmentDescription;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    //used when working with Sets (have unique elements) and Maps (have unique keys)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assignment that = (Assignment) o;
        return courseNumber == that.courseNumber &&
                uniqueID.equals(that.uniqueID) &&
                assignmentTitle.equals(that.assignmentTitle) &&
                assignmentDescription.equals(that.assignmentDescription) &&
                difficultyLevel.equals(that.difficultyLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uniqueID,courseNumber,assignmentTitle,assignmentDescription,difficultyLevel);
    }

    @Override
    public String toString() {
        return String.format("Assignment %s title: %s, level: %s\n",
                this.getCourseNumber(),
                this.getAssignmentTitle(),
                this.getDifficultyLevel());
    }
}
