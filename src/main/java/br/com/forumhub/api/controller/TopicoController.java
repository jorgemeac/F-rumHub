package br.com.forumhub.api.controller;

import br.com.forumhub.api.curso.Curso;
import br.com.forumhub.api.curso.CursoRepository;
import br.com.forumhub.api.exceptions.ResourceNotFoundException;
import br.com.forumhub.api.topico.DadosCriacaoTopico;
import br.com.forumhub.api.topico.Topico;
import br.com.forumhub.api.topico.TopicoRepository;
import br.com.forumhub.api.usuario.Usuario;
import br.com.forumhub.api.usuario.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<?> criarTopico(@RequestBody DadosCriacaoTopico dadosTopico) {
        Usuario usuario = usuarioRepository.findById(dadosTopico.idUsuario())
                .orElseThrow(() -> new ResourceNotFoundException("Usuário não encontrado"));
        Curso curso = cursoRepository.findById(dadosTopico.idCurso())
                .orElseThrow(() -> new ResourceNotFoundException("Curso não encontrado"));

        Topico topico = new Topico(dadosTopico);
        topico.setIdUsuario(usuario);
        topico.setIdCurso(curso);

        Topico topicoSalvo = topicoRepository.save(topico);
        return ResponseEntity.status(HttpStatus.CREATED).body(topicoSalvo);
    }
}
