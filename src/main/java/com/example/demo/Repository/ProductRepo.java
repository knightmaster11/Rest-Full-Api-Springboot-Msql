package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Account;

public interface ProductRepo extends CrudRepository<Account, Long> {
    
    List<Account> findByNameContains (String name);
}
