package test.lantwo.model;

import java.io.Serializable;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "industry")
public class Industry implements Serializable {

    @Id
    @Column(name = "manganh", length = 10)
    @NotBlank(message = "Mã ngành không được để trống")
    @Size(min = 2, max = 10, message = "Mã ngành phải từ 2 đến 10 ký tự")
    private String manganh;

    @Column(name = "tennganh")
    @NotBlank(message = "Tên ngành không được để trống")
    @Size(min = 3, message = "Tên ngành phải có ít nhất 3 ký tự")
    private String tennganh;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false)
    @NotNull(message = "Ngành phải thuộc một nhóm ngành (Category)")
    private Category category;
}
