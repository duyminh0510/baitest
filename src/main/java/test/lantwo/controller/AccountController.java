package test.lantwo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import test.lantwo.model.Account;
import test.lantwo.service.AccountService;

@Controller
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    // Hiển thị danh sách tài khoản
    @GetMapping
    public String listAccounts(Model model) {
        model.addAttribute("accounts", accountService.findAll());
        return "account/list"; // Thymeleaf template: account/list.html
    }

    // Form thêm tài khoản mới
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("account", new Account());
        return "account/form"; // Thymeleaf template: account/form.html
    }

    // Xử lý thêm tài khoản
    @PostMapping("/add")
    public String addAccount(@Valid @ModelAttribute("account") Account account,
                             BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "account/form";
        }
        accountService.save(account);
        return "redirect:/accounts";
    }

    // Form cập nhật tài khoản
    @GetMapping("/edit/{username}")
    public String showEditForm(@PathVariable("username") String username, Model model) {
        return accountService.findById(username)
            .map(account -> {
                model.addAttribute("account", account);
                return "account/form"; // dùng lại form
            })
            .orElse("redirect:/accounts");
    }

    // Xử lý cập nhật tài khoản
    @PostMapping("/edit/{username}")
    public String updateAccount(@PathVariable("username") String username,
                                @Valid @ModelAttribute("account") Account account,
                                BindingResult result) {
        if (result.hasErrors()) {
            return "account/form";
        }
        accountService.save(account);
        return "redirect:/accounts";
    }

    // Xóa tài khoản
    @GetMapping("/delete/{username}")
    public String deleteAccount(@PathVariable("username") String username) {
        accountService.deleteById(username);
        return "redirect:/accounts";
    }
}
