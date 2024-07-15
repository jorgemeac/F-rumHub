package br.com.forumhub.api.curso;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "curso_forum") //criar uma tabela com este nome
@Entity(name = "curso")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idCurso")
public class Curso {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private Long idCurso;

    @Column(name = "nome_curso")
    private String nomeCurso;

    @Column(name = "categoria_curso")
    private String categoriaCurso;

    public Curso (DadosCurso dadosCurso) {
        this.idCurso = dadosCurso.idCurso();
        this.nomeCurso = dadosCurso.nomeCurso();
        this.categoriaCurso = dadosCurso.categoriaCurso();
    }

}