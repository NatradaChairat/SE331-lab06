package camt.cbsd.services;

import camt.cbsd.entity.Student;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Profile("firstDataSource")
@Service
public class StudentServiceImpl implements StudentService {
    String imageBaseUrl = "http://localhost:300/images/";
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();

        /*Student student = new Student(1,"SE-001","Mitsuha","Miyamizu",
                2.15,"images/mitsuha.gif",true,0,
                "The most beloved one");
        students.add(student);
        student = new Student(2,"SE-002","Prayuth","The minister",
                3.59,"images/tu.jpg",false,15,
                "The great man ever!!!!");
        students.add(student);
        student = new Student(3,"SE-003","Jurgen","Kloop",
                2.15,"images/Kloop.gif",true,2,
                "The man for the Kop");*/
        Student student = new Student(1,"SE-001","Mitsuha","Miyamizu",
                2.15,imageBaseUrl+"mitsuha.gif",true,0,
                "The most beloved one");
        students.add(student);
        student = new Student(2,"SE-002","Prayuth","The minister",
                3.59,imageBaseUrl+"tu.jpg",false,15,
                "The great man ever!!!!");
        students.add(student);
        student = new Student(3,"SE-003","Jurgen","Kloop",
                2.15,imageBaseUrl+"Kloop.gif",true,2,
                "The man for the Kop");
        students.add(student);
        return students;
    }
}
