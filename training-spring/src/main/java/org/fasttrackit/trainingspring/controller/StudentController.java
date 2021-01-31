package org.fasttrackit.trainingspring.controller;

import org.fasttrackit.trainingspring.model.Student;
import org.fasttrackit.trainingspring.model.entity.StudentEntity;
import org.fasttrackit.trainingspring.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//Presentation Layer
@RestController
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService injectedService) {  // spring-ul se ocupa de injectare pentru noi
        this.service = injectedService;  //cauta toate obiectele de tip studentservice pe care el le-a creat si le injecteaza aici
    }

    @GetMapping("/api/student/{id}")
    public Student getStudentById(@PathVariable(name = "id") Long stundentId) {
        return service.getStudentById(stundentId);
    }

    @GetMapping("/api/student")
    public ResponseEntity<List<Student>> getStudentsBy(@RequestParam(name = "lastname", required = false) String lastname,
                                  @RequestParam(name = "firstname", required = false) String firstname) {

        return ResponseEntity.ok(this.service.findStudentsBy(lastname, firstname));
    }

    @GetMapping("/api/student")
    public List<Student> getAllStudents(){
        return service.findAllStudents();
    }

    //Create operations
    @PostMapping("/api/student")
    public ResponseEntity<Student> createNewStudent(@RequestBody Student studentRequest){

        return ResponseEntity.ok(service.createNewStudent(studentRequest));
    }

    @PutMapping("/api/student")
    public ResponseEntity<Student> updateStudent(@RequestBody Student updateRequest){
        if(updateRequest.getId()==null || updateRequest.getId() <= 0){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(updateRequest);
        }
        return ResponseEntity.ok(service.updateStudent(updateRequest));
    }

    @DeleteMapping("/api/student/{id}")
    public void deleteStudent(@PathVariable("id") Long idToDelete){
        this.service.deleteStudentById(idToDelete);
    }

    //Update operations => PUT
    //Delete operations => DELETE
    //CRUD: Create, Read, Update, Delete
    //in spring tot ceea ce are anotari si tot ceea ce este injectat are numele generic de Bean, Service,Controller= Bean, clasa student o controlam manual=nu este un Bean
}
