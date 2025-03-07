package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Account;
import com.example.demo.dto.ResponeData;
import com.example.demo.services.ProductService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/products")

public class productController {

    @Autowired
    private ProductService productService;


    @PostMapping
    public ResponseEntity<ResponeData<Account>>  save(@Valid @RequestBody Account product, Errors errors){
        
        ResponeData<Account> responeData = new ResponeData<>();

        if(errors.hasErrors()){
            for (ObjectError error : errors.getAllErrors()) {
                responeData.getMessages().add(error.getDefaultMessage());
            }

            responeData.setStatus(false);
            responeData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responeData);

        }
        responeData.setStatus(true);
        responeData.setPayload(productService.save(product));
        return ResponseEntity.ok(responeData);
    }
    @GetMapping
    public Iterable<Account> findAll(){
        return productService.findAll();
    
    }

    @GetMapping("/{id}")
    public Account findOne(@PathVariable("id") long id){
        return productService.findOne(id);
    }
    
    @PutMapping
    public ResponseEntity<ResponeData<Account>>  update(@Valid @RequestBody Account product, Errors errors){
        ResponeData<Account> responeData = new ResponeData<>();

        if(errors.hasErrors()){
            for (ObjectError error : errors.getAllErrors()) {
                responeData.getMessages().add(error.getDefaultMessage());
            }

            responeData.setStatus(false);
            responeData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responeData);

        }
        responeData.setStatus(true);
        responeData.setPayload(productService.save(product));
        return ResponseEntity.ok(responeData);
    }
    
    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") long id){
         productService.removeOne(id);
    }
}
