CREATE TABLE usuarios
(
    id_usuario SERIAL PRIMARY KEY,
    nome       VARCHAR(100)        NOT NULL,
    email      VARCHAR(100) UNIQUE NOT NULL,
    senha      VARCHAR(255)        NOT NULL,
    role       VARCHAR(20)         NOT NULL CHECK (role IN ('admin', 'editor', 'viewer'))
);


CREATE TABLE eventos
(
    id_evento      SERIAL PRIMARY KEY,
    titulo         VARCHAR(150) NOT NULL,
    descricao      TEXT,
    data_inicio    TIMESTAMP    NOT NULL,
    data_fim       TIMESTAMP,
    local          VARCHAR(255) NOT NULL,
    id_organizador INT          REFERENCES usuarios (id_usuario) ON DELETE SET NULL
);


CREATE TABLE posts_blog
(
    id_post         SERIAL PRIMARY KEY,
    titulo          VARCHAR(150) NOT NULL,
    conteudo        TEXT         NOT NULL,
    autor_id        INT          REFERENCES usuarios (id_usuario) ON DELETE SET NULL,
    data_publicacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE galeria
(
    id_item     SERIAL PRIMARY KEY,
    titulo      VARCHAR(150) NOT NULL,
    tipo        VARCHAR(10)  NOT NULL CHECK (tipo IN ('foto', 'video')),
    url         TEXT         NOT NULL,
    descricao   TEXT,
    data_upload TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE textos_institucionais
(
    id_texto         SERIAL PRIMARY KEY,
    tipo             VARCHAR(20) NOT NULL UNIQUE CHECK (tipo IN ('missao', 'visao', 'valores', 'sobre')),
    conteudo         TEXT        NOT NULL,
    data_atualizacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE faq
(
    id_faq           SERIAL PRIMARY KEY,
    pergunta         TEXT NOT NULL,
    resposta         TEXT NOT NULL,
    data_atualizacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE categorias_blog
(
    id_categoria SERIAL PRIMARY KEY,
    nome         VARCHAR(100) NOT NULL UNIQUE
);


CREATE TABLE post_categorias
(
    id_post      INT REFERENCES posts_blog (id_post) ON DELETE CASCADE,
    id_categoria INT REFERENCES categorias_blog (id_categoria) ON DELETE CASCADE,
    PRIMARY KEY (id_post, id_categoria)
);


CREATE TABLE participantes_evento
(
    id_participante SERIAL PRIMARY KEY,
    nome            VARCHAR(100) NOT NULL,
    email           VARCHAR(100),
    telefone        VARCHAR(15),
    id_evento       INT REFERENCES eventos (id_evento) ON DELETE CASCADE
);