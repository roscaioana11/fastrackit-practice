package org.fasttrackit.trainingspring.service;


import org.fasttrackit.trainingspring.model.Student;
import org.fasttrackit.trainingspring.model.entity.StudentEntity;
import org.fasttrackit.trainingspring.repository.StudentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {

    @InjectMocks
    private StudentService service;

    //The mock will create an object of type "StudentRepository" which will not do anything
    //If we want any method called from "repository" to be done, we must manually define it with Mokito.when(...)
    @Mock
    private StudentRepository repository;

    @Test
    public  void createNewStudent_expectedRepositorySaveMethodCalled(){
        Student studentRequest = new Student(); //Given part / Test setup
        Mockito.when(this.repository.save(ArgumentMatchers.any(StudentEntity.class))).thenReturn(new StudentEntity()); //am adaugat asta pt ca a fost chemat un null pointer exception la StudentEntity

        this.service.createNewStudent(studentRequest); //When the Service method calls the 'createNewStudent' method

        Mockito.verify(repository).save(ArgumentMatchers.any(StudentEntity.class)); //Then the repository "save" method is called
    }

    @Test
    public void createNewStudent_expectedActualValuesFromRepository() {
        // Given (test setup)
        StudentEntity expectedEntity = new StudentEntity();
        expectedEntity.setId(2L);
        expectedEntity.setFirstName("Ion");
        expectedEntity.setLastName("Pop");
        Mockito.when(repository.save(ArgumentMatchers.any())).thenReturn(expectedEntity);

        // When (action to test)
        Student actualCreatedStudent = service.createNewStudent(new Student());

        // Then (assertions)
        Assertions.assertNotNull(actualCreatedStudent);
        Assertions.assertEquals("Ion", actualCreatedStudent.getFirstName());
        Assertions.assertEquals("Pop", actualCreatedStudent.getLastName());
        Assertions.assertNull(actualCreatedStudent.getDateOfBirth());
    }
}