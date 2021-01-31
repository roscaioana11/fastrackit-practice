package org.fasttrackit.trainingspring.controller.model;

import java.util.List;

public class RenameStudentsDto {
    private List<Long> studentIds;
    private String newFirstname;

    public List<Long> getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(List<Long> studentIds) {
        this.studentIds = studentIds;
    }

    public String getNewFirstname() {
        return newFirstname;
    }

    public void setNewFirstname(String newFirstname) {
        this.newFirstname = newFirstname;
    }
}
