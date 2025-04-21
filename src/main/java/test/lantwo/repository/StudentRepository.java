package test.lantwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.lantwo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
