package org.fasttrackit.trainingspring.repository;

import org.fasttrackit.trainingspring.model.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


//Data Access Layer
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {  //extinde un genetic care are un type = StudentEntity si un ID = Long, asteapta sa ii vina o entitate, ceva care este anotat cu @Entity. Cand prinde un time, el implementeaza la runtime. Cand vede ca are entitate isi creaza automat metodele necesare la runtime(springul isi face in fundal beanuri)

    //@Query("select s from student s where s.first_name = :firstName", nativeQuery = true) // SQL
    //nu este query SQL ci JPQL, nu se ia dupa numele tabelului ci al entitatii
    @Query("select s from student s where s.firstname = :firstName") //JPQL (Java Persistence Query Language)
    Optional<StudentEntity> findStudentByFirstName(@Param("firstName") String firstname);

    List<StudentEntity> findStudentEntitiesByFirstnameEqualsOrLastnameEquals(String firstname,String lastname);

    List<StudentEntity> findAllByIdIn(List<Long> ids);
}
