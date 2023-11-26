package com.example.Account_Service.Repo;

import com.example.Account_Service.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {


    @Query(
            nativeQuery = true,
            value
                    = "SELECT account.account_id,account.customer_id,account.is_Active, account.account_balance FROM account_service.account join account_service.customer on account.customer_id = customer.customer_id where account.customer_id=:customerId")
    Optional<Account> findByCustomerId(@PathVariable("customerId") int customerId);
}

