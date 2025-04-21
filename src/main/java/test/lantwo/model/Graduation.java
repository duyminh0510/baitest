package test.lantwo.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "graduation")
public class Graduation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id", nullable = false)
    @NotNull(message = "Sinh viên không được để trống")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "manganh", referencedColumnName = "manganh", nullable = false)
    @NotNull(message = "Ngành tốt nghiệp không được để trống")
    private Industry industry;

    @ManyToOne
    @JoinColumn(name = "matruong", referencedColumnName = "matruong", nullable = false)
    @NotNull(message = "Trường tốt nghiệp không được để trống")
    private School school;

    @Column(name = "ngay_tot_nghiep", nullable = false)
    @NotNull(message = "Ngày tốt nghiệp không được để trống")
    @PastOrPresent(message = "Ngày tốt nghiệp phải trong quá khứ hoặc hiện tại")
    private LocalDate ngayTotNghiep;

    @Column(name = "loai_tot_nghiep", nullable = false)
    @NotBlank(message = "Loại tốt nghiệp không được để trống")
    private String loaiTotNghiep;

    @Column(name = "he_tot_nghiep", nullable = false)
    @NotBlank(message = "Hệ tốt nghiệp không được để trống")
    private String heTotNghiep;
}
