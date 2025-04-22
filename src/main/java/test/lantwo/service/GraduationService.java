package test.lantwo.service;

import java.util.List;
import java.util.Optional;
import test.lantwo.model.Graduation;

public interface GraduationService {
    List<Graduation> findAll();
    Optional<Graduation> findById(Integer id);
    Graduation save(Graduation graduation);
    void deleteById(Integer id);
}
