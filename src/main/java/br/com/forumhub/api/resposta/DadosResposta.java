package br.com.forumhub.api.resposta;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosResposta(
        @NotBlank
        String conteudo,

        @NotNull
        @JsonAlias("id_topico")
        Long idTopico,

        @NotNull
        @JsonAlias("id_autor")
        Long idAutor
) {
}
