CREATE TABLE topico_forum (
                              id_topico BIGINT AUTO_INCREMENT PRIMARY KEY,
                              titulo VARCHAR(255) NOT NULL,
                              conteudo TEXT NOT NULL,
                              horario_postagem TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                              status TINYINT NOT NULL DEFAULT 1,
                              respostas TEXT,
                              id_autor BIGINT NOT NULL,
                              id_curso BIGINT NOT NULL,
                              FOREIGN KEY (id_autor) REFERENCES usuario_forum(id_usuario),
                              FOREIGN KEY (id_curso) REFERENCES curso_forum(id_curso)
);
