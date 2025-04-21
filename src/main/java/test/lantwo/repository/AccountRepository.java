package test.lantwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.lantwo.model.Account;

public interface AccountRepository extends JpaRepository<Account, String> {

}
