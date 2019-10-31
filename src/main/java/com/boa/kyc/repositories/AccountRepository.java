package com.boa.kyc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boa.kyc.models.Account;

public interface AccountRepository extends JpaRepository<Account,Integer>{

}
