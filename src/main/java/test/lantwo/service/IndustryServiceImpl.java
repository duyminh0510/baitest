package test.lantwo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.lantwo.model.Industry;
import test.lantwo.repository.IndustryRepository;
import test.lantwo.service.IndustryService;

@Service
public class IndustryServiceImpl implements IndustryService {

    @Autowired
    private IndustryRepository industryRepository;

    @Override
    public List<Industry> findAll() {
        return industryRepository.findAll();
    }

    @Override
    public Optional<Industry> findById(String id) {
        return industryRepository.findById(id);
    }

    @Override
    public Industry save(Industry industry) {
        return industryRepository.save(industry);
    }

    @Override
    public void deleteById(String id) {
        industryRepository.deleteById(id);
    }
}
