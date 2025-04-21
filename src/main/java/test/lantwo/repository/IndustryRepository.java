package test.lantwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.lantwo.model.Industry;

public interface IndustryRepository extends JpaRepository<Industry, String> {

}
