package com.basry.queryside.mappers;


import com.basry.queryside.dto.AccountOperationResponseDTO;
import com.basry.queryside.dto.BankAccountResponseDTO;
import com.basry.queryside.entities.AccountOperation;
import com.basry.queryside.entities.BankAccount;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankAccountMapper {
    BankAccountResponseDTO bankAccountToBankAccountDTO(BankAccount bankAccount);
    AccountOperationResponseDTO accountOperationToAccountOperationDTO(AccountOperation accountOperation);
}
