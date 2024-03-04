package com.didi.mybank.context;

import com.didi.mybank.services.TransactionService;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {
    public static final TransactionService transactionService = new TransactionService();
    public static final ObjectMapper objectMapper = new ObjectMapper();
}
