package com.example.Account_Service.Controller;

import com.example.Account_Service.Model.Account;
import com.example.Account_Service.Service.AccountService;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/account")
public class Controller{

    @Autowired
    private AccountService accountService;

    @GetMapping("/accounts")
    public ResponseEntity<List<Account>>getList(){
        List<Account> lt=accountService.getList();
        return new ResponseEntity<List<Account>>(lt,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Account> addAccount(@RequestBody Account account){
        Account ac=accountService.add(account);
        return new ResponseEntity<Account>(ac,HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getById(@PathVariable("id") Integer id){
        Account ac=accountService.findById(id);
        return new ResponseEntity<Account>(ac,HttpStatus.OK);
    }

    @GetMapping("/id/{customerId}")
    public ResponseEntity<Account> getByCustomerId(@PathVariable("customerId") Integer id){
        Account ac=accountService.findByCustomerId(id);
        return new ResponseEntity<Account>(ac,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Account> updateAll(@RequestBody Account account){

        Account acc=accountService.updateAll(account);
        return new ResponseEntity<Account>(acc,HttpStatus.CREATED);

    }



}
