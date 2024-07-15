package br.com.forumhub.api.topico;

import br.com.forumhub.api.curso.Curso;
import br.com.forumhub.api.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Table(name = "topico_forum")
@Entity(name = "Topico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idTopico")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_topico")
    private Long idTopico;

    private String titulo;

    private String conteudo;

    @Column(name = "horario_postagem", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime horarioPostagem;

    private Boolean status;

    private String respostas;

    @ManyToOne
    @JoinColumn(name = "id_autor", nullable = false)
    private Usuario idUsuario;

    @ManyToOne
    @JoinColumn(name = "id_curso", nullable = false)
    private Curso idCurso;

    public Topico(DadosCriacaoTopico dadosTopico) {
        this.titulo = dadosTopico.titulo();
        this.conteudo = dadosTopico.conteudo();
        this.status = dadosTopico.status();
        this.respostas = dadosTopico.respostas();
    }
}
