package org.fasttrackit.trainingspring.controller;

import org.fasttrackit.trainingspring.model.Student;
import org.fasttrackit.trainingspring.service.StudentService;
import org.springframework.web.bind.annotation.*;


//Presentation Layer
@RestController
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService injectedService) {  // spring-ul se ocupa de injectare pentru noi
        this.service = injectedService;  //cauta toate obiectele de tip studentservice pe care el le-a creat si le injecteaza aici
    }

    //Read operations
    @GetMapping("/api/student/{mesaj}")
    public String getFirstMessage(@PathVariable("mesaj") String mesajText,
                                  @RequestParam(name = "mesaj2", required = false) String mesajText2) {  // ?mesaj2=asd
        return "<h1> Salut!</h1> \n  Am primit mesajul: " + mesajText + "\n " + mesajText2;
    }

    @GetMapping("/basic")
    public  String hellp(){
        return  "asd";
    }

    //Create operations
    @PostMapping(/*name = */"/api/student")
    public Student createNewStudent(@RequestBody Student studentRequest){
    /*
    (@RequestParam(name = "lastname", required = false) String lastname,
    @RequestParam(name = "firstname", required = false) String firstname)
        Student newStudent = new Student();
        newStudent.setFirstName(firstname);
        newStudent.setLastName(lastname);
        return newStudent;
        */

        return /*studentRequest*/ service.createNewStudent(studentRequest);
    }

    //Update operations => PUT
    //Delete operations => DELETE
    //CRUD: Create, Read, Update, Delete
    //in spring tot ceea ce are anotari si tot ceea ce este injectat are numele generic de Bean, Service,Controller= Bean, clasa student o controlam manual=nu este un Bean
}
