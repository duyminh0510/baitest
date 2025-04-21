package test.lantwo.model;

import java.io.Serializable;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "SoCCCD", nullable = false, unique = true)
    @NotBlank(message = "Số CCCD không được để trống")
    @Pattern(regexp = "^\\d{12}$", message = "Số CCCD phải có đúng 12 chữ số")
    private String SoCCCD;

    @Column(name = "FullName", nullable = false)
    @NotBlank(message = "Họ tên không được để trống")
    @Size(min = 3, message = "Họ tên phải ít nhất 3 ký tự")
    private String FullName;

    @Column(name = "Email", nullable = false)
    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không đúng định dạng")
    private String Email;

    @Column(name = "Phone", nullable = false)
    @NotBlank(message = "Số điện thoại không được để trống")
    @Pattern(regexp = "^\\d{10}$", message = "Số điện thoại phải có đúng 10 số")
    private String phone;

    @Column(name = "address", nullable = false)
    @NotBlank(message = "Địa chỉ không được để trống")
    private String address;

    @OneToOne
    @JoinColumn(name = "username", referencedColumnName = "username", nullable = false, unique = true)
    @NotNull(message = "Tài khoản không được để trống")
    private Account account;
}
