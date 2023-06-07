package com.api.carteira.dto.receive;

import com.api.carteira.exception.AtivoFinanceiroException;
import com.api.carteira.model.AtivoFinanceiro;
import com.api.carteira.model.enums.TipoAtivo;
import java.io.Serializable;

import static com.api.carteira.exception.AtivoFinanceiroMessageException.*;


public record AtivoFinanceiroDto(String ticker, String tipo, Float percentualAlocacao,
                                 Float precoTeto) implements Serializable {



    public AtivoFinanceiroDto(String ticker, String tipo, Float percentualAlocacao,
                              Float precoTeto){
        if(ticker == null | ticker.isEmpty()){
            throw new AtivoFinanceiroException(TICKER_INVALIDO);
        }
        if(tipo == null | tipo.isEmpty()){
            throw new AtivoFinanceiroException(TICKER_INVALIDO);
        }
        if(percentualAlocacao == null ){
            throw new AtivoFinanceiroException(PERCENTUAL_INVALIDO);
        }
        if(precoTeto == null ){
            throw new AtivoFinanceiroException(PRECO_INVALIDO);
        }

        this.ticker = ticker;
        this.tipo=tipo;
        this.percentualAlocacao=percentualAlocacao;
        this.precoTeto=precoTeto;
    }

    public AtivoFinanceiro converter() {

        AtivoFinanceiro ativoFinanceiro = new AtivoFinanceiro(this.ticker,
                TipoAtivo.valueOf(this.tipo),
                this.percentualAlocacao,
                this.precoTeto);
        return ativoFinanceiro;
    }

    public static AtivoFinanceiroDto converter(AtivoFinanceiro ativoFinanceiro) {

        return new AtivoFinanceiroDto(ativoFinanceiro.getTicker(),
                ativoFinanceiro.getTipo().toString(),
                ativoFinanceiro.getPercentualAlocacao(),
                ativoFinanceiro.getPrecoTeto());
    }

}
