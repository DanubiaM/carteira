package com.api.carteira.service;

import com.api.carteira.dto.receive.AtivoFinanceiroDto;
import com.api.carteira.dto.response.AtivoFinanceiroResponseDto;
import com.api.carteira.exception.AtivoFinanceiroException;
import com.api.carteira.model.AtivoFinanceiro;
import com.api.carteira.model.enums.TipoAtivo;
import com.api.carteira.repository.AtivoFinanceiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.api.carteira.exception.AtivoFinanceiroMessageException.TICKER_JA_CADASTRADO;
import static com.api.carteira.exception.AtivoFinanceiroMessageException.TICKER_NAO_LOCALIZADO;

@Service
public class AtivoFinanceiroService {

    @Autowired
    AtivoFinanceiroRepository ativoFinanceiroRepository;

    public void salvar(AtivoFinanceiroDto ativoFinanceiroDto) {
        if (ativoFinanceiroRepository.findByTicker(ativoFinanceiroDto.ticker()).isPresent()){
            throw new AtivoFinanceiroException(TICKER_JA_CADASTRADO);
        }

        ativoFinanceiroRepository.save(ativoFinanceiroDto.converter());
    }

    public Page<AtivoFinanceiroResponseDto> listarTodos(Pageable pageable){
        return ativoFinanceiroRepository.findAll(pageable).map(AtivoFinanceiroResponseDto::converter);
    }

    public AtivoFinanceiroResponseDto buscarPorTicket(String id) {
        return ativoFinanceiroRepository.findByTicker(id)
                                        .map(AtivoFinanceiroResponseDto::converter)
                                        .orElseThrow(() ->new AtivoFinanceiroException(TICKER_NAO_LOCALIZADO));
    }

    public void deletarPorTicket(String ticker) {
        buscarPorTicket(ticker);
        ativoFinanceiroRepository.deleteByTicker(ticker);
    }

    public void atualizar(AtivoFinanceiroDto ativoFinanceiroDto) {

        Optional<AtivoFinanceiro> ativoFinanceiro = ativoFinanceiroRepository.findByTicker(ativoFinanceiroDto.ticker());

        if (!ativoFinanceiro.isPresent()){
            throw new AtivoFinanceiroException(TICKER_NAO_LOCALIZADO);
        }

        ativoFinanceiro.get().setPercentualAlocacao(ativoFinanceiroDto.percentualAlocacao());
        ativoFinanceiro.get().setPrecoTeto(ativoFinanceiroDto.precoTeto());
        ativoFinanceiro.get().setTicker(ativoFinanceiroDto.ticker());
        ativoFinanceiro.get().setTipo(TipoAtivo.valueOf(ativoFinanceiroDto.tipo()));

        ativoFinanceiroRepository.save(ativoFinanceiro.get());


    }
}
