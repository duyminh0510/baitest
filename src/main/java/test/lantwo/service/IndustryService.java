package test.lantwo.service;

import java.util.List;
import java.util.Optional;
import test.lantwo.model.Industry;

public interface IndustryService {
    List<Industry> findAll();
    Optional<Industry> findById(String id);
    Industry save(Industry industry);
    void deleteById(String id);
}
