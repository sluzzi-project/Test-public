package it.sluzzi.myti.webserviceRest.controller;

import java.net.URI;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
 
import it.sluzzi.myti.webserviceRest.dao.StudentDao;
import it.sluzzi.myti.webserviceRest.model.Student;
import it.sluzzi.myti.webserviceRest.model.Students;
	 
@RestController
@RequestMapping(path = "/students")
public class StudentController 
{
    @Autowired
    private StudentDao studentDao;
     
    @GetMapping(path="/", produces = "application/json")
    public Students getStudents() 
    {
        return studentDao.getAllStudents();
    }
     
    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addStudent(@RequestBody Student student) 
    {
        Integer id = studentDao.getAllStudents().getStudentList().size() + 1;
        student.setId(id);
         
        studentDao.addStudent(student);
         
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(student.getId())
                                    .toUri();
         
        return ResponseEntity.created(location).build();
    }
}
