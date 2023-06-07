package com.api.carteira.repository;

import com.api.carteira.dto.response.AtivoFinanceiroResponseDto;
import com.api.carteira.model.AtivoFinanceiro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AtivoFinanceiroRepository extends JpaRepository<AtivoFinanceiro, Long> {

    Optional<AtivoFinanceiro> findByTicker(String ticker);

    void deleteByTicker(String ticker);
}