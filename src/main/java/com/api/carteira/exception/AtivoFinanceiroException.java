package com.api.carteira.exception;

public class AtivoFinanceiroException extends RuntimeException{

    public AtivoFinanceiroException(String id){
        super(id);
    }
}
