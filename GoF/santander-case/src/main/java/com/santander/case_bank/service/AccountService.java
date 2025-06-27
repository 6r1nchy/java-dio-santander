package com.santander.case_bank.service;

import com.santander.case_bank.model.Account;
import java.util.List;

public interface AccountService {
    List<Account> getAllAccounts();
    Account getAccountById(Long id);
    Account createAccount(Account account);
    void deleteAccount(Long id);
}
