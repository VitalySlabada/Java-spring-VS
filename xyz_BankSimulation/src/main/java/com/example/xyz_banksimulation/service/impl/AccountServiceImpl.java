package com.example.xyz_banksimulation.service.impl;

import com.example.xyz_banksimulation.entity.Account;
import com.example.xyz_banksimulation.enums.AccountType;
import com.example.xyz_banksimulation.repository.AccountRepository;
import com.example.xyz_banksimulation.service.AccountService;
import lombok.Builder;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Component

public class AccountServiceImpl implements AccountService {

    AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account createNewAccount(BigDecimal balance, Date creationDate, AccountType accountType, Long userId) {
        Account account = Account.builder().id(UUID.randomUUID()).userId(userId).accountType(accountType).balance(balance).creationDate(creationDate).build();
        return accountRepository.save(account);
    }

    @Override
    public List<Account> listAccount() {
        return AccountRepository.findAll();

    }

}