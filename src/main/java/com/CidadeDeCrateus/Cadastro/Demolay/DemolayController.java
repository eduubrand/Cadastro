package com.CidadeDeCrateus.Cadastro.Demolay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemolayController {

    @GetMapping("/boasvindas")
    public String boasVinda() {

        return "Primeira Mensagem";
    }
}
