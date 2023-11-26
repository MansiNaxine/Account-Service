package com.example.Account_Service.Service;

import com.example.Account_Service.Model.Account;
import com.example.Account_Service.Repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepo accountRepo;

    @Autowired
    private ModelMapper mapper;

    public List<Account> getList(){

        return (List<Account>) accountRepo.findAll();
    }

    public Account add(Account account){

        return accountRepo.save(account);
    }

    public Account findById(Integer id){

        return accountRepo.findById(id).get();

    }

    public Account findByCustomerId(Integer id){

        Optional<Account> account=accountRepo.findByCustomerId(id);
        Account accountDetails=mapper.map(account,Account.class);
        return accountDetails;
    }

    public Account updateAll(Account account)
    {
        return accountRepo.save(account);
    }


}
