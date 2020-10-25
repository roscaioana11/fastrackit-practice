package fastrackit.classroom.c5;

import java.util.*;

public class CollectionUniqueElements {
    public static void main(String[] args) {

        // 2. collection with elements
        List<Assignment> assignments = new ArrayList<>();
        //instantierea obiectului
        Assignment firstNumber = new Assignment(UUID.randomUUID(),1,"course1","homework1","easy");
        Assignment secondNumber = new Assignment(UUID.randomUUID(),2,"course2","homework2","medium");
        Assignment thirdNumber = new Assignment(UUID.randomUUID(),3,"course3","homework3","hard");

        //adaugarea obiectului in lista
        //assignments.add(firstNumber);
        //assignments.add(secondNumber);
        //assignments.add(thirdNumber);

        //sortarea obiectelor folosind un Comparator
        /*AssignmentComparator comparator1 = new AssignmentComparator();
        AssignmentComparator comparator2 = new AssignmentComparator();
        AssignmentComparator comparator3 = new AssignmentComparator();


        Collections.sort(assignments, comparator1);
        Collections.sort(assignments, comparator2);
        Collections.sort(assignments, comparator3);
         */

        //3,4 ??
        TreeSet<Assignment> assignmentTreeSet = new TreeSet<>(Comparator.comparing(Assignment::getCourseNumber).thenComparing(Assignment::getDifficultyLevel));
        assignmentTreeSet.add(firstNumber);
        assignmentTreeSet.add(secondNumber);
        assignmentTreeSet.add(thirdNumber);

        TreeSet<Assignment> assignmentTreeSet1 = new TreeSet<>(Comparator.comparing(Assignment::getCourseNumber).thenComparing(Assignment::getAssignmentTitle));
        assignmentTreeSet1.add(firstNumber);
        assignmentTreeSet1.add(secondNumber);
        assignmentTreeSet1.add(thirdNumber);

        System.out.println(assignmentTreeSet);
        System.out.println(assignmentTreeSet1);

        //Set<Assignment> assignmentSet = new TreeSet<>(comparator1);
        //SortedSet assignment = new TreeSet(comparator1);



        // 5
        HashMap<String, Assignment> assignmentHashMap = new HashMap<String, Assignment>();
        assignmentHashMap.put("1" + "easy", firstNumber);
        assignmentHashMap.put("2" + "medium", secondNumber);
        assignmentHashMap.put("3" + "hard", thirdNumber);

        System.out.println(assignmentHashMap.get("1" + "easy"));

    }
}