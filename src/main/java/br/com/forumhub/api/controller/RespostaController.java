package br.com.forumhub.api.controller;

import br.com.forumhub.api.resposta.Resposta;
import br.com.forumhub.api.resposta.RespostaRepository;
import br.com.forumhub.api.topico.Topico;
import br.com.forumhub.api.topico.TopicoRepository;
import br.com.forumhub.api.usuario.Usuario;
import br.com.forumhub.api.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/respostas")
public class RespostaController {

    @Autowired
    private RespostaRepository respostaRepository;

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Resposta criarResposta(@RequestBody Resposta resposta, @AuthenticationPrincipal User user) {
        String username = user.getUsername();
        Usuario usuario = usuarioRepository.findByNomeUsuario(username)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        Topico topico = topicoRepository.findById(resposta.getTopico().getIdTopico())
                .orElseThrow(() -> new RuntimeException("Tópico não encontrado"));

        resposta.setAutor(usuario);
        resposta.setTopico(topico);

        return respostaRepository.save(resposta);
    }
}
