package com.api.carteira.controller;

import com.api.carteira.dto.receive.AtivoFinanceiroDto;
import com.api.carteira.dto.response.AtivoFinanceiroResponseDto;
import com.api.carteira.service.AtivoFinanceiroService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/wallet")
@RestController
public class WalletController {

    @Autowired
    AtivoFinanceiroService ativoFinanceiroService;

    @Value("${IP_SERVICE_AF}")
    String ip_af;

    @PostMapping
    ResponseEntity<?> salvar(@RequestBody AtivoFinanceiroDto ativoFinanceiroDto){

        ativoFinanceiroService.salvar(ativoFinanceiroDto);

        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Page<AtivoFinanceiroResponseDto>> listarTodos(@PageableDefault(page=0, size = 10) Pageable pageable) {

        return new ResponseEntity<>(ativoFinanceiroService.listarTodos(pageable), HttpStatus.OK);

    }


    @GetMapping("/{id}")
    public ResponseEntity<AtivoFinanceiroResponseDto> buscar(@PathVariable("id") String id){
        return new ResponseEntity<>(ativoFinanceiroService.buscarPorTicket(id), HttpStatus.OK);

    }

    @Transactional
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable("id") String id){
        ativoFinanceiroService.deletarPorTicket(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @Transactional
    @PutMapping
    public ResponseEntity<?> atualizar(@Valid @RequestBody AtivoFinanceiroDto ativoFinanceiroDto){
        ativoFinanceiroService.atualizar(ativoFinanceiroDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("buscarHistorico/{id}")
    public ResponseEntity<?> buscarHistorico(@PathVariable("id") String ticker){


        final String uri = "http://"+ip_af+":3333/assets?symbol="+ticker;
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
        return new ResponseEntity<>(result.getBody(),HttpStatus.OK);
    }

}
