CREATE TABLE usuario_forum (
                               id_usuario BIGINT AUTO_INCREMENT PRIMARY KEY,
                               nome_completo VARCHAR(255) NOT NULL,
                               nome_usuario VARCHAR(255) NOT NULL,
                               email VARCHAR(255) NOT NULL,
                               senha_hash VARCHAR(255) NOT NULL
);
