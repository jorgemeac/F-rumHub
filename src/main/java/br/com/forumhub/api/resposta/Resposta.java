package br.com.forumhub.api.resposta;

import br.com.forumhub.api.topico.Topico;
import br.com.forumhub.api.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "resposta_forum")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Resposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_resposta")
    private Long idResposta;

    @ManyToOne
    @JoinColumn(name = "id_topico", nullable = false)
    private Topico topico;

    @ManyToOne
    @JoinColumn(name = "id_autor", nullable = false)
    private Usuario autor;

    @Column(name = "conteudo", columnDefinition = "TEXT")
    private String conteudo;

    @CreationTimestamp
    @Column(name = "horario_postagem", nullable = false, updatable = false)
    private LocalDateTime horarioPostagem;

    @Column(name = "solucao", nullable = false)
    private Boolean solucao = false;
}
