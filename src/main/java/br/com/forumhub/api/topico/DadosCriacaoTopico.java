package br.com.forumhub.api.topico;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCriacaoTopico(
        @NotBlank
        String titulo,

        @NotBlank
        String conteudo,

        @NotNull
        Boolean status,

        @NotNull
        @JsonAlias("id_usuario")
        Long idUsuario,

        @NotNull
        @JsonAlias("id_curso")
        Long idCurso
) {
}
