package test.lantwo.repository;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import test.lantwo.model.Job;
import test.lantwo.model.JobId;

public interface JobRepository extends JpaRepository<Job, JobId> {

    List<Job> findByStudent_Id(Integer studentId);

    List<Job> findByIndustry_Manganh(String manganh);

    List<Job> findByNgayVaoCongTyBefore(LocalDate date);
}
