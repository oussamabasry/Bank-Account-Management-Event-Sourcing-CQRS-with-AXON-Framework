package com.basry.queryside.repository;

import com.basry.queryside.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
