package br.com.forumhub.api.usuario.login;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "UsuarioLogin")
@Table(name = "usuario_login")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idUsuarioLogin")
public class UsuarioLogin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario_login") //valor que vai para a tabela usuario_login
    private Long idUsuarioLogin;
    private String login;
    private String senha;
}
