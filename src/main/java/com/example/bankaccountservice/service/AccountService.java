package com.example.bankaccountservice.service;

import com.example.bankaccountservice.dto.BankAccountResponseDTO;
import com.example.bankaccountservice.dto.BankAccountRequestDTO;


public interface AccountService {
     BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);


}
