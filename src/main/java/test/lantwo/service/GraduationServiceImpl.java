package test.lantwo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.lantwo.model.Graduation;
import test.lantwo.repository.GraduationRepository;
import test.lantwo.service.GraduationService;

@Service
public class GraduationServiceImpl implements GraduationService {

    @Autowired
    private GraduationRepository graduationRepository;

    @Override
    public List<Graduation> findAll() {
        return graduationRepository.findAll();
    }

    @Override
    public Optional<Graduation> findById(Integer id) {
        return graduationRepository.findById(id);
    }

    @Override
    public Graduation save(Graduation graduation) {
        return graduationRepository.save(graduation);
    }

    @Override
    public void deleteById(Integer id) {
        graduationRepository.deleteById(id);
    }
}
