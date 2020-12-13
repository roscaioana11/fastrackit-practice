package ro.fastrackit.classroom.c5;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionUniqueElements {
    public static void main(String[] args) {

        // 2. collection with elements
        Set<Assignment> assignments = new HashSet<>();
        //instantierea obiectului
        Assignment firstNumber = new Assignment(UUID.randomUUID(),1,"course1","homework1","easy");
        Assignment secondNumber = new Assignment(UUID.randomUUID(),2,"course2","homework2","medium");
        Assignment thirdNumber = new Assignment(UUID.randomUUID(),3,"course3","homework3","hard");
        Assignment firstDifferentDifficulty = new Assignment(UUID.randomUUID(),1,"course1","homework1","astonishingly difficult");
        Assignment firstDifferentTitle = new Assignment(UUID.randomUUID(),1,"course4","homework1","hard");



        //adaugarea obiectului in lista
        assignments.add(firstNumber);
        assignments.add(secondNumber);
        assignments.add(thirdNumber);
        assignments.add(firstDifferentDifficulty);
        assignments.add(firstDifferentTitle);

        /*sortarea obiectelor folosind un Comparator
        AssignmentComparator comparator1 = new AssignmentComparator();
        AssignmentComparator comparator2 = new AssignmentComparator();
        AssignmentComparator comparator3 = new AssignmentComparator();


        Collections.sort(assignments, comparator1);
        Collections.sort(assignments, comparator2);
        Collections.sort(assignments, comparator3);
         */

        //3,4 ??
        System.out.println("Before Sorting: " + assignments);
        TreeSet<Assignment> assignmentTreeSet = new TreeSet<>(Comparator.comparing(Assignment::getCourseNumber).thenComparing(Assignment::getDifficultyLevel));
        assignmentTreeSet.add(firstNumber);
        assignmentTreeSet.add(secondNumber);
        assignmentTreeSet.add(thirdNumber);
        assignmentTreeSet.add(firstDifferentDifficulty);
        assignmentTreeSet.add(firstDifferentTitle);

        TreeSet<Assignment> assignmentTreeSet1 = new TreeSet<>(Comparator.comparing(Assignment::getCourseNumber).thenComparing(Assignment::getAssignmentTitle));
        assignmentTreeSet1.add(firstNumber);
        assignmentTreeSet1.add(secondNumber);
        assignmentTreeSet1.add(thirdNumber);
        assignmentTreeSet.add(firstDifferentTitle);

        System.out.println("After sorting: " + assignments);
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

        //c6 1.1
        System.out.println("Print UUIDs: ");
        List<UUID> assignmentsList = assignments
                .stream()
                .map(singleAssignment -> singleAssignment.getUniqueID())
                .peek(System.out::println)
                .collect(Collectors.toList());

        //c6 1.2
        System.out.println("Print the filtered difficulty level:");
        List<Assignment> assignmentsFilter = assignments
                .stream()
                .filter(thisAssignment -> thisAssignment.getDifficultyLevel().equals("easy") || thisAssignment.getDifficultyLevel().equals("medium"))
                .peek(System.out::println)
                .collect(Collectors.toList());


        //c6 1.4
        System.out.println("Hash map:");
        Map<UUID, Assignment> streamHashMap = assignments
                .stream()
                .collect(Collectors.toMap(Assignment::getUniqueID, Function.identity()));
        for (var e : streamHashMap.entrySet()) {
            System.out.println(String.format("Key: %s, value: %s", e.getKey(), e.getValue()));
        }


    }
}
