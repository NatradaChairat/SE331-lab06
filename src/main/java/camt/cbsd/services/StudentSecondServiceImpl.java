package camt.cbsd.services;

import camt.cbsd.dao.StudentDao;
import camt.cbsd.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Profile("secondDataSource")
@Service
public class StudentSecondServiceImpl implements StudentService {
    /*@Override
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        Student student = new Student(1,"SE-000","Chartchai","D",
                5.00,"images/temp.gif",true,0,
                "The Special One");
        students.add(student);

        return students;
    }*/
    @Autowired
    StudentDao myStudentDao;
    public  List<Student> getStudents(){
        return myStudentDao.getStudents();
    }
}
