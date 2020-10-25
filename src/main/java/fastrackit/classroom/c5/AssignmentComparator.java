package fastrackit.classroom.c5;

import java.util.Comparator;

public class AssignmentComparator implements Comparator<Assignment> {

    @Override
    public int compare(Assignment o1,Assignment o2) {
        return Integer.compare(o1.getCourseNumber(),o2.getCourseNumber());
    }

}
