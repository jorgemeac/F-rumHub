package br.com.forumhub.api.curso;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCurso(
        @NotNull //validação para números
        @JsonAlias("id_curso") Long idCurso,
        @NotBlank //validação benvalidation para o nome do curso não ser vazio e nem nulo (String)
        @JsonAlias("nome_curso") String nomeCurso,

        @NotBlank
        @JsonAlias("categoria_curso") String categoriaCurso
) {
}
