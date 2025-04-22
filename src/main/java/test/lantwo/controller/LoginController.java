package test.lantwo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    // Hiển thị trang login (GET)
    @GetMapping("/login")
    public String loginPage(@RequestParam(value = "error", required = false) String error,
                            @RequestParam(value = "logout", required = false) String logout,
                            Model model) {
        // Nếu có lỗi đăng nhập, thêm thông báo lỗi vào model
        if (error != null) {
            model.addAttribute("errorMsg", "Tên đăng nhập hoặc mật khẩu không đúng.");
        }

        // Nếu người dùng đã đăng xuất, thêm thông báo vào model
        if (logout != null) {
            model.addAttribute("msg", "Bạn đã đăng xuất thành công.");
        }

        // Trả về trang login (thư mục views/login.html)
        return "views/login";
    }

    // Xử lý đăng nhập (POST)
    @PostMapping("/login")
    public String loginProcess(@RequestParam String username, 
                               @RequestParam String password, 
                               Model model) {
        // Giả sử bạn có một cách để kiểm tra tài khoản và mật khẩu
        if ("admin".equals(username) && "password".equals(password)) {
            return "redirect:/home"; // Nếu đăng nhập thành công, chuyển hướng tới trang chính
        }
        model.addAttribute("errorMsg", "Tên đăng nhập hoặc mật khẩu không đúng.");
        return "views/login"; // Nếu đăng nhập thất bại, quay lại trang login với thông báo lỗi
    }
}
