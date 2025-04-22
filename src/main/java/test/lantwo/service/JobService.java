package test.lantwo.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import test.lantwo.model.Job;
import test.lantwo.model.JobId;

public interface JobService {
    List<Job> findAll();
    Optional<Job> findById(JobId id);
    Job save(Job job);
    void deleteById(JobId id);

    List<Job> findByStudentId(Integer studentId);
    List<Job> findByIndustryManganh(String manganh);
    List<Job> findByNgayVaoCongTyBefore(LocalDate date);
}
