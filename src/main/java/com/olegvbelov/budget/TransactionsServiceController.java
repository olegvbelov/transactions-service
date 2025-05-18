package com.olegvbelov.budget;

import io.micronaut.http.annotation.*;

@Controller("/transactions-service")
public class TransactionsServiceController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}