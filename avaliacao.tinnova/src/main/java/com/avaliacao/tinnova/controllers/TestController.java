package com.avaliacao.tinnova.controllers;

import java.util.List;

import com.avaliacao.tinnova.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avaliacao.tinnova.interfaces.service.IVeiculoService;
import com.avaliacao.tinnova.model.Veiculo;

@RestController

@RequestMapping(value="/test")
public class TestController {
    @Autowired
    private TestService testService;

    @CrossOrigin
    @RequestMapping ("percentualValidos")
    public double percentualValidos() {
        return testService.percentualValidos();
    }
    @CrossOrigin
    @RequestMapping ("percentualBrancos")
    public double percentualBrancos() {
        return testService.percentualBrancos();
    }
    @CrossOrigin
    @RequestMapping ("percentualNulos")
    public double percentualNulos() {
        return testService.percentualNulos();
    }

    @CrossOrigin
    @RequestMapping ("ordenarVetor")
    public int[] ordenarVetor() {
        return testService.ordenarVetor();
    }

    @CrossOrigin
    @RequestMapping("fatorial/{x}")
    public double fatorial(@PathVariable("x") double x) {
        return testService.fatorial(x);
    }

}
