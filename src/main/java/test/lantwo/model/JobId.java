package test.lantwo.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobId implements Serializable {

    private Integer student;
    private LocalDate ngayVaoCongTy;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof JobId))
            return false;
        JobId jobId = (JobId) o;
        return Objects.equals(student, jobId.student) &&
                Objects.equals(ngayVaoCongTy, jobId.ngayVaoCongTy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, ngayVaoCongTy);
    }
}
