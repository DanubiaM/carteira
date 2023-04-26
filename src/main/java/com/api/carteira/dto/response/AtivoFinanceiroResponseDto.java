package com.api.carteira.dto.response;

import com.api.carteira.model.AtivoFinanceiro;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;


public record AtivoFinanceiroResponseDto(String ticker, String tipo,
                                         Float percentualAlocacao, Float precoTeto,
                                         String uuid) implements Serializable {

    public static AtivoFinanceiroResponseDto converter(AtivoFinanceiro ativoFinanceiro) {

        return new AtivoFinanceiroResponseDto(ativoFinanceiro.getTicker(),
                ativoFinanceiro.getTipo().toString(),
                ativoFinanceiro.getPercentualAlocacao(),
                ativoFinanceiro.getPrecoTeto(),
                ativoFinanceiro.getUuid());
    }

}
