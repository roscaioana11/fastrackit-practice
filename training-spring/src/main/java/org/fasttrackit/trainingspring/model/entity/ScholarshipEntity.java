package org.fasttrackit.trainingspring.model.entity;


import javax.persistence.*;

@Entity(name = "scholarship")
public class ScholarshipEntity {

    @Id
    private Long id;

    @Column
    private String description;

    @Column
    private Integer amount;

    @OneToOne
    @JoinColumn(name = "id", unique = true) //face join 1-1 din idu de la student
    private StudentEntity grantedTo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public StudentEntity getGrantedTo() {
        return grantedTo;
    }

    public void setGrantedTo(StudentEntity grantedTo) {
        this.grantedTo = grantedTo;
    }
}
