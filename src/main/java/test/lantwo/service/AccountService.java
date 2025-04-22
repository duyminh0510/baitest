package test.lantwo.service;

import java.util.List;
import java.util.Optional;
import test.lantwo.model.Account;

public interface AccountService {
    List<Account> findAll();
    Optional<Account> findById(String username);
    Account save(Account account);
    void deleteById(String username);
}
