package camt.cbsd.services;

import camt.cbsd.dao.StudentDao;
import camt.cbsd.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;


@Profile("firstDataSource")
/*@ConfigurationProperties(prefix="server")*/
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;
    public List<Student> getStudents(){
        return studentDao.getStudents();
    }

    @Override
    public Student findById(long id) {
        return studentDao.findById(id);
    }



    /*//String imageBaseUrl = "http://localhost:3000/images/";
    String imageBaseUrl;
    String baseUrl;
    String imageUrl;
    public void setBaseUrl(String baseUrl){
        this.baseUrl = baseUrl;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl=imageUrl;
    }
    @PostConstruct
    protected void setImageBaseUrl(){
        this.imageBaseUrl = this.baseUrl + this.imageUrl;
    }

    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();

        *//*Student student = new Student(1,"SE-001","Mitsuha","Miyamizu",
                2.15,"images/mitsuha.gif",true,0,
                "The most beloved one");
        students.add(student);
        student = new Student(2,"SE-002","Prayuth","The minister",
                3.59,"images/tu.jpg",false,15,
                "The great man ever!!!!");
        students.add(student);
        student = new Student(3,"SE-003","Jurgen","Kloop",
                2.15,"images/Kloop.gif",true,2,
                "The man for the Kop");*//*
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
    }*/
}
