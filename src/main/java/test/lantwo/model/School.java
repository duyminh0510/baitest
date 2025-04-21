package test.lantwo.model;

import java.io.Serializable;

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
@Table(name = "school")
public class School implements Serializable {

    @Id
    @Column(name = "matruong", length = 10)
    @NotBlank(message = "Mã trường không được để trống")
    @Size(min = 2, max = 10, message = "Mã trường phải từ 2 đến 10 ký tự")
    private String matruong;

    @Column(name = "tentruong")
    @NotBlank(message = "Tên trường không được để trống")
    @Size(min = 3, message = "Tên trường phải có ít nhất 3 ký tự")
    private String tentruong;

    @Column(name = "address")
    @NotBlank(message = "Địa chỉ không được để trống")
    private String address;

    @Column(name = "Phone")
    @NotBlank(message = "Số điện thoại không được để trống")
    @Pattern(regexp = "^\\d{10}$", message = "Số điện thoại phải có đúng 10 số")
    private String phone;
}
