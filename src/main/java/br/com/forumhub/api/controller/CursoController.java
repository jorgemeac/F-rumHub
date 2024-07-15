package br.com.forumhub.api.controller;

import br.com.forumhub.api.curso.Curso;
import br.com.forumhub.api.curso.CursoRepository;
import br.com.forumhub.api.curso.DadosCurso;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("curso")
public class CursoController {
    @Autowired //Injeção de dependências para ser colocado no Readme
    private CursoRepository repository;

    @PostMapping
    @Transactional
    public void inserirCurso(@RequestBody @Valid DadosCurso dadosCurso){
        repository.save(new Curso(dadosCurso));
    }
}

