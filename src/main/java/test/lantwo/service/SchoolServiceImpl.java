package test.lantwo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.lantwo.model.School;
import test.lantwo.repository.SchoolRepository;
import test.lantwo.service.SchoolService;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    @Override
    public List<School> findAll() {
        return schoolRepository.findAll();
    }

    @Override
    public Optional<School> findById(String id) {
        return schoolRepository.findById(id);
    }

    @Override
    public School save(School school) {
        return schoolRepository.save(school);
    }

    @Override
    public void deleteById(String id) {
        schoolRepository.deleteById(id);
    }
}
