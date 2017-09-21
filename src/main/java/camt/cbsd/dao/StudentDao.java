package camt.cbsd.dao;

import camt.cbsd.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getStudents();
    Student findById(long id);
}
