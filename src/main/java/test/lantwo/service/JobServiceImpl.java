package test.lantwo.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.lantwo.model.Job;
import test.lantwo.model.JobId;
import test.lantwo.repository.JobRepository;
import test.lantwo.service.JobService;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobRepository jobRepository;

    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public Optional<Job> findById(JobId id) {
        return jobRepository.findById(id);
    }

    @Override
    public Job save(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public void deleteById(JobId id) {
        jobRepository.deleteById(id);
    }

    @Override
    public List<Job> findByStudentId(Integer studentId) {
        return jobRepository.findByStudent_Id(studentId);
    }

    @Override
    public List<Job> findByIndustryManganh(String manganh) {
        return jobRepository.findByIndustry_Manganh(manganh);
    }

    @Override
    public List<Job> findByNgayVaoCongTyBefore(LocalDate date) {
        return jobRepository.findByNgayVaoCongTyBefore(date);
    }
}
