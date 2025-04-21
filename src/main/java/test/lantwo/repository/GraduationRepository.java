package test.lantwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.lantwo.model.Graduation;

public interface GraduationRepository extends JpaRepository<Graduation, Integer> {

}
