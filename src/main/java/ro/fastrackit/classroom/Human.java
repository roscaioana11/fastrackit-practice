package ro.fastrackit.classroom;

import java.time.LocalDate;

public interface Human {

    String getLastName();
    String getFirstName();
    LocalDate getDateOfBirth();
    String getEmailAddress();

    ScholarType getType();

}
