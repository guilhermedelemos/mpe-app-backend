package io.github.mpeapp.controller;

import io.github.mpeapp.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pais")
public class PaisController {

    @Autowired
    private PaisRepository paisRepository;

    @GetMapping
    public Iterable findAll() {
        return paisRepository.findAll();
    }

    @GetMapping("/nome/{nome}")
    public List findByNome(@PathVariable String nome) {
        return paisRepository.findByNome(nome);
    }

    @GetMapping("/sigla/{sigla}")
    public List findBySigla(@PathVariable String sigla) {
        return paisRepository.find
    }
}
