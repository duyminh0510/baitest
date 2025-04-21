package test.lantwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.lantwo.model.School;

public interface SchoolRepository extends JpaRepository<School, String> {

}
