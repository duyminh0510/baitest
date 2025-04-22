package test.lantwo.service;

import java.util.List;
import java.util.Optional;
import test.lantwo.model.Student;

public interface StudentService {
    List<Student> findAll();
    Optional<Student> findById(Integer id);
    Student save(Student student);
    void deleteById(Integer id);
}
