package br.com.forumhub.api.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "usuario_forum") //criar uma nova tabela com este nome
@Entity(name = "usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idUsuario")
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "nome_completo")
    private String nomeCompleto;

    @Column(name = "nome_usuario")
    private String nomeUsuario;

    private String email;

    @Column(name = "senha_hash")
    private String senha;

    public Usuario (DadosUsuario dadosUsuario) {
        this.idUsuario = dadosUsuario.idUsuario();
        this.nomeCompleto = dadosUsuario.nomeCompleto();
        this.nomeUsuario = dadosUsuario.nomeUsuario();
        this.email = dadosUsuario.email();
        this.senha = dadosUsuario.senha();
    }

}
