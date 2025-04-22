package test.lantwo.service;

import java.util.List;
import java.util.Optional;
import test.lantwo.model.School;

public interface SchoolService {
    List<School> findAll();
    Optional<School> findById(String id);
    School save(School school);
    void deleteById(String id);
}
