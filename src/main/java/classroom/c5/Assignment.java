package classroom.c5;

import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

public class Assignment {
    UUID UniqueID; //fields
    int CourseNumber;
    String AssignmentTitle;
    String AssignmentDescription;
    String DifficultyLevel;


    public Assignment(UUID uniqueID, int courseNumber, String assignmentTitle, String assignmentDescription, String difficultyLevel) { //constructor
        this.UniqueID = uniqueID;
        this.CourseNumber = courseNumber;
        this.AssignmentTitle = assignmentTitle;
        this.AssignmentDescription = assignmentDescription;
        this.DifficultyLevel = difficultyLevel;
    }

    public UUID getUniqueID() {
        return UniqueID;
    }

    public int getCourseNumber() {
        return CourseNumber;
    }

    public String getAssignmentTitle() {
        return AssignmentTitle;
    }

    public String getAssignmentDescription() {
        return AssignmentDescription;
    }

    public String getDifficultyLevel() {
        return DifficultyLevel;
    }

    //used when working with Sets (have unique elements) and Maps (have unique keys)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assignment that = (Assignment) o;
        return CourseNumber == that.CourseNumber &&
                UniqueID.equals(that.UniqueID) &&
                AssignmentTitle.equals(that.AssignmentTitle) &&
                AssignmentDescription.equals(that.AssignmentDescription) &&
                DifficultyLevel.equals(that.DifficultyLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(UniqueID,CourseNumber,AssignmentTitle,AssignmentDescription,DifficultyLevel);
    }

    @Override
    public String toString() {
        return String.format("Assignment %s title: %s, level: %s\n",
                this.getCourseNumber(),
                this.getAssignmentTitle(),
                this.getDifficultyLevel());
    }
}
