package com.basry.commandside.services;

import com.basry.commandside.dto.CreateAccountRequestDTO;
import com.basry.commandside.dto.CreditAccountRequestDTO;
import com.basry.commandside.dto.DebitAccountRequestDTO;

import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {
    CompletableFuture<String> createAccount(CreateAccountRequestDTO accountRequestDTO);
    CompletableFuture<String> debitAccount(DebitAccountRequestDTO debitAccountRequestDTO);
    CompletableFuture<String> creditAccount(CreditAccountRequestDTO creditAccountRequestDTO);
}
