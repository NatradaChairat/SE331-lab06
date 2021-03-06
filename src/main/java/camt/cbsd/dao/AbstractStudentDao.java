package camt.cbsd.dao;

import camt.cbsd.entity.Student;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractStudentDao implements StudentDao{
    List<Student> students;
    String imageBaseUrl;
    String baseUrl;
    String imageUrl;
    public void setBaseUrl(String baseUrl){
        this.baseUrl = baseUrl;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl=imageUrl;
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public Student findById(long id) {
        return students.stream().filter(s -> s.getId() == id).findFirst().get();
    }
}
