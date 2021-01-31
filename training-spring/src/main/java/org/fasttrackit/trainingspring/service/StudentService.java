package org.fasttrackit.trainingspring.service;


import org.fasttrackit.trainingspring.model.Student;
import org.fasttrackit.trainingspring.model.entity.StudentEntity;
import org.fasttrackit.trainingspring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//BusinessLogic Layer
@Service
public class StudentService {

    @Value("8081") // SpEL (Spring Expression Language)
    private String servicePort;

    private final StudentRepository repository; //mappam/injectam repository in clasa service

    private final EntityManager entityManager;

    public StudentService(StudentRepository injectedRepository,EntityManager entityManager){
        this.repository = injectedRepository;
        this.entityManager = entityManager;
    }

    public Student mapEntityToStudentResponse(StudentEntity entity){  //pt refactor code, folosim metoda asta sa scurtam codul de mai jos
        Student response = new Student();
        response.setId(entity.getId());
        response.setLastName(entity.getLastName());
        response.setFirstName(entity.getFirstName());
        response.setDateOfBirth(entity.getDateOfBirth());
        return response;
    }

    public Student getStudentById(Long stundentId){
        //pre java8 => `repository.findById(studentId)` COULD RETURN A NULL, so you always had to check for that
        //after java8 => `repository.findById(studentId)` ALWAYS RETURNED OPTIONAL, which was never null, so you could always call methods directly on it => easier to use
        Optional<StudentEntity> foundEntity = repository.findById(stundentId);

        //v1
        if(foundEntity.isPresent()) {
            StudentEntity entity = foundEntity.get();
            Student response = mapEntityToStudentResponse(entity);
            /*Student response = new Student();
            response.setId(entity.getId());
            response.setLastName(entity.getLastName());
            response.setFirstName(entity.getFirstName());
            response.setDateOfBirth(entity.getDateOfBirth())
            return response;
             */
        }
        //v2
        if(!foundEntity.isPresent()){
            return null;
        }
        return foundEntity
                .map(entityToMap -> mapEntityToStudentResponse(entityToMap))
                .get();
                    /*Student response2 = new Student();
                    response2.setId(entityToMap.getId());
                    response2.setLastName(entityToMap.getLastName());
                    response2.setFirstName(entityToMap.getFirstName());
                    response2.setDateOfBirth(entityToMap.getDateOfBirth());
                    return response2;
                     */
    }

    public Student findStudentBy(String firstname){
        return this.repository.findStudentByFirstName(firstname)
                .map(entity -> mapEntityToStudentResponse(entity))
                .get();
    }

    public List<Student> findStudentsBy(String lastname, String firstname){
        return this.repository.findStudentEntitiesByFirstnameEqualsOrLastnameEquals(firstname, lastname)
                .stream()
                .map(entity -> mapEntityToStudentResponse(entity))
                .collect(Collectors.toList());
    }

    public List<Student> findAllStudents(){
        //v1 pre-java8
        List<StudentEntity> allEntities = this.repository.findAll();

        List<Student> responseList = new ArrayList<>();

        for(StudentEntity entity : allEntities){
            /*
            Student student = new Student();
            student.setId(entity.getId());
            student.setFirstName(entity.getFirstName());
            student.setLastName(entity.getLastName());
            student.setDateOfBirth(entity.getDateOfBirth());
             */
            responseList.add(mapEntityToStudentResponse(entity));
        }


        //v2 post-java8
        return this.repository.findAll()
                .stream()
                .map(entity -> mapEntityToStudentResponse(entity))
                .collect(Collectors.toList());
                    /*
                    Student student = new Student();
                    student.setId(entity.getId());
                    student.setLastName(entity.getLastName());
                    student.setFirstName(entity.getFirstName());
                    student.setDateOfBirth(entity.getDateOfBirth());
                    return student;
                     */
    }

    public Student createNewStudent(Student request){  //returnam newStudent pt ca aici ar trebui sa fie o clasa de request nu student, clase diferite pt layere diferite desi se refera la acelasi domain object, adica sa nu manipulam datele despre student asa usor si sa nu refolosim neaparat din clase la aceleasi nivele

        //cream o entitate
        StudentEntity newStudent = new /*Student*/ StudentEntity(); //nu mai avem Student, o sa avem un StudentEntity dupa ce face layerul de data access si injectam in clasa de service
        newStudent.setLastName(request.getLastName()+"escu");
        newStudent.setFirstName(request.getFirstName()+" Luna");
        newStudent.setDateOfBirth(request.getDateOfBirth());

        //salvam entitatea
        StudentEntity saveEntity = this.repository.save(newStudent);

        //cream manual un response object
        return mapEntityToStudentResponse(saveEntity);
    }

    public Student updateStudent(Student req){
        StudentEntity entityToUpdate = new StudentEntity();
        entityToUpdate.setId(req.getId()); //here is the diff between update and save
        entityToUpdate.setLastName(req.getLastName());
        entityToUpdate.setFirstName(req.getFirstName());
        entityToUpdate.setDateOfBirth(req.getDateOfBirth());

        StudentEntity updateEntity = this.repository.save(entityToUpdate);

        return mapEntityToStudentResponse(updateEntity);
    }

    public void deleteStudentById(Long id){
        this.repository.deleteById(id);
    }

    @Transactional
    public void renameAllStudents(List<Long> studentIds, String newFirstname) {
        List<StudentEntity> allById = this.repository.findAllByIdIn(studentIds);

        allById.forEach(student ->
        {
            double randomNumber = Math.random() * 10;
            if(randomNumber>5) {
                throw new RuntimeException("n-am chef");
            }

            student.setFirstName(newFirstname);
            this.repository.save(student);
        });
    }

    private EntityManager em(){
        return entityManager;
    }

}
