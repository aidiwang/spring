package com.didi.mybank.services;

import com.didi.mybank.model.Transaction;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TransactionService {
    List<Transaction> transactions = new CopyOnWriteArrayList<>();

    public TransactionService(){

    }
    public List<Transaction> findAll(){
        return transactions;
    }
    public Transaction create(int amount, String reference){
        Transaction transaction = new Transaction(amount, reference);
        transactions.add(transaction);
        return transaction;
    }
}
