package test.lantwo.service;

import java.util.List;
import java.util.Optional;
import test.lantwo.model.Category;

public interface CategoryService {
    List<Category> findAll();
    Optional<Category> findById(Integer id);
    Category save(Category category);
    void deleteById(Integer id);
}
