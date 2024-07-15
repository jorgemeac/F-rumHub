package br.com.forumhub.api.usuario;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosUsuario(
        @NotNull
        @JsonAlias("id_usuario") Long idUsuario,

        @NotBlank
        @JsonAlias("nome_completo")String nomeCompleto,

        @NotBlank
        @JsonAlias("nome_usuario")String nomeUsuario,

        @NotBlank @Email
        String email,

        @NotBlank
        @Pattern(regexp = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
                message = "A senha deve ter pelo menos 8 caracteres, incluindo uma letra maiúscula, um dígito e um caractere especial.")

        String senha) {

}