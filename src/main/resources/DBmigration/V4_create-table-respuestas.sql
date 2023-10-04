CREATE TABLE IF NOT EXISTS respuestas(
    id BIGINT AUTO_INCREMENT,
    mensaje varchar(350) not null,
    topico_id BIGINT NOT NULL,
    fecha_creacion DATE NOT NULL,
    autor_id BIGINT NOT NULL,
    solucion BOOLEAN NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(topico_id) REFERENCES topicos(id),
    FOREIGN KEY (autor_id) REFERENCES usuarios(id)

)ENGINE=InnoDB DEFAULT CHARSET=UTF8;