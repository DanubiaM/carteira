package com.api.carteira.model;

import com.api.carteira.model.enums.TipoAtivo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class AtivoFinanceiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(unique=true)
    private String ticker;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_ativo")
    private TipoAtivo tipo;

    @Column(name = "percental_alocacao")
    private Float percentualAlocacao;
    private Float precoTeto;

    private String uuid = String.valueOf(UUID.randomUUID());


    public AtivoFinanceiro(String aTicker, TipoAtivo aTipo, Float aPercentualAlocacao, Float aPrecoTeto) {
        this.ticker = aTicker;
        this.tipo = aTipo;
        this.percentualAlocacao = aPercentualAlocacao;
        this.precoTeto = aPrecoTeto;
    }


}
