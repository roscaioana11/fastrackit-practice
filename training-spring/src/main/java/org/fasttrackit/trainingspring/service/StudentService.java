package org.fasttrackit.trainingspring.service;


import org.fasttrackit.trainingspring.model.Student;
import org.fasttrackit.trainingspring.model.entity.StudentEntity;
import org.fasttrackit.trainingspring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//BusinessLogic Layer
@Service
public class StudentService {

    @Value("8081") // SpEL (Spring Expression Language)
    private String servicePort;

    private final StudentRepository repository; //mappam/injectam repository in clasa service

    public StudentService(StudentRepository injectedRepository){
        this.repository = injectedRepository;
    }

    public Student createNewStudent(Student request){  //returnam newStudent pt ca aici ar trebui sa fie o clasa de request nu student, clase diferite pt layere diferite desi se refera la acelasi domain object, adica sa nu manipulam datele despre student asa usor si sa nu refolosim neaparat din clase la aceleasi nivele

        /*Student*/
        //cream o entitate
        StudentEntity newStudent = new /*Student*/ StudentEntity(); //nu mai avem Student, o sa avem un StudentEntity dupa ce face layerul de data access si injectam in clasa de service
        newStudent.setLastName(request.getLastName()+"escu");
        newStudent.setFirstName(request.getFirstName()+" Luna");
        newStudent.setDateOfBirth(request.getDateOfBirth());

        //salvam entitatea
        StudentEntity saveEntity = this.repository.save(newStudent);

        //cream manual un response object
        Student responseObject = new Student(); //nu mai manipulam aceste date, le lasam immutable pe cat de mult posibil
        responseObject.setId(saveEntity.getId());
        responseObject.setFirstName(saveEntity.getFirstName());
        responseObject.setLastName(saveEntity.getLastName());
        responseObject.setDateOfBirth(saveEntity.getDateOfBirth());
        return responseObject;

        //return newStudent;
    }
}
