package br.com.forumhub.api.controller;

import br.com.forumhub.api.exceptions.ResourceNotFoundException;
import br.com.forumhub.api.topico.DadosCriacaoTopico;
import br.com.forumhub.api.topico.Topico;
import br.com.forumhub.api.topico.TopicoRepository;
import br.com.forumhub.api.usuario.Usuario;
import br.com.forumhub.api.usuario.UsuarioRepository;
import br.com.forumhub.api.curso.Curso;
import br.com.forumhub.api.curso.CursoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topico")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    @Transactional
    public void criarTopico(@RequestBody @Valid DadosCriacaoTopico dadosTopico) {
        Usuario autor = usuarioRepository.findById(dadosTopico.idUsuario())
                .orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado com o ID: " + dadosTopico.idUsuario()));

        Curso curso = cursoRepository.findById(dadosTopico.idCurso())
                .orElseThrow(() -> new ResourceNotFoundException("Curso não encontrado com o ID: " + dadosTopico.idCurso()));

        Topico topico = new Topico(dadosTopico, autor, curso);
        topicoRepository.save(topico);
    }
}
