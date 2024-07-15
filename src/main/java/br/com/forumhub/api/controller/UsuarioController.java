package br.com.forumhub.api.controller;

import br.com.forumhub.api.usuario.DadosUsuario;
import br.com.forumhub.api.usuario.Usuario;
import br.com.forumhub.api.usuario.UsuarioRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
    @Autowired //Injeção de dependências para ser colocado no Readme
    private UsuarioRepository repository;

    @PostMapping
    @Transactional
    public void criarUsuario(@RequestBody @Valid DadosUsuario dadosUsuario){
        repository.save(new Usuario(dadosUsuario));
    }

}

