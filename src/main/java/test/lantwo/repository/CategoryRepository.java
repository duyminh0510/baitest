package test.lantwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.lantwo.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
