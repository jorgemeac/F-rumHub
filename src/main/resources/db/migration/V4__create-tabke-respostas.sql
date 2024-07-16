CREATE TABLE IF NOT EXISTS resposta_forum (
                                              id_resposta BIGINT AUTO_INCREMENT PRIMARY KEY,
                                              id_topico BIGINT NOT NULL,
                                              id_autor BIGINT NOT NULL,
                                              conteudo TEXT NOT NULL,
                                              horario_postagem TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                              solucao TINYINT NOT NULL DEFAULT 0,
                                              FOREIGN KEY (id_topico) REFERENCES topico_forum(id_topico),
    FOREIGN KEY (id_autor) REFERENCES usuario_forum(id_usuario)
    );