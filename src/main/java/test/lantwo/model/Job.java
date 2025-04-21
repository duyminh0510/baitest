package test.lantwo.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job")
@IdClass(JobId.class)
public class Job implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id", nullable = false)
    private Student student;

    @Id
    @Column(name = "ngay_vao_cong_ty", nullable = false)
    @NotNull(message = "Ngày vào công ty không được để trống")
    private LocalDate ngayVaoCongTy;

    @ManyToOne
    @JoinColumn(name = "manganh", referencedColumnName = "manganh", nullable = false)
    @NotNull(message = "Ngành làm việc không được để trống")
    private Industry industry;

    @Column(name = "ten_cong_viec", nullable = false)
    @NotBlank(message = "Tên công việc không được để trống")
    private String tenCongViec;

    @Column(name = "ten_cong_ty", nullable = false)
    @NotBlank(message = "Tên công ty không được để trống")
    private String tenCongTy;

    @Column(name = "dia_chi_cong_ty", nullable = false)
    @NotBlank(message = "Địa chỉ công ty không được để trống")
    private String diaChiCongTy;

    @Column(name = "thoi_gian_lam_viec")
    private String thoiGianLamViec;
}
