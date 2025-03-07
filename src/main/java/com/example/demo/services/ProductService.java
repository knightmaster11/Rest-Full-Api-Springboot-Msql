package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Account;
import com.example.demo.Repository.ProductRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {
    
    @Autowired
    private ProductRepo productRepo;

    public Account save(Account product){
        return productRepo.save(product);
    }

    public Account findOne(long id) {

        Optional<Account> product = productRepo.findById(id);
        if(!product.isPresent()){
            return null;
        }
        return product.get();
    }

    public Iterable<Account> findAll(){
        return productRepo.findAll();
    }

    public void removeOne(long id) {
        productRepo.deleteById(id);
    }
    public List<Account> findByName (String name){
        return productRepo.findByNameContains(name);
    }
}
