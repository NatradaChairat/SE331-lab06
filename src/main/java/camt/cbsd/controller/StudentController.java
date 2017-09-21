package camt.cbsd.controller;

import camt.cbsd.entity.Student;
import camt.cbsd.services.StudentService;
import camt.cbsd.services.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Component
//@Path("/student")
@RestController
public class StudentController {
    StudentService studentService;
    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
    /*@GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudents(){

        List<Student> students = studentService.getStudents();
        return Response.ok(students).build();
    }*/
    @GetMapping("/student")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseEntity<?> getStudents(){
        List<Student> students = studentService.getStudents();
        return ResponseEntity.ok(students);
    }
    @GetMapping("/student/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseEntity getStudent(@PathVariable("id")long id){
        Student student = studentService.findById(id);
        return ResponseEntity.ok(student);
    }
}
