package org.fasttrackit.trainingspring.repository;

import org.fasttrackit.trainingspring.model.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//Data Access Layer
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
