DROP TABLE IF EXISTS autor;
DROP TABLE IF EXISTS editora;
DROP TABLE IF EXISTS livro;
CREATE TABLE autor (
  id int(5) NOT NULL AUTO_INCREMENT,
  nome varchar(255) NOT NULL,
  email varchar(100) DEFAULT NULL,
  PRIMARY KEY (id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
CREATE TABLE editora (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  email varchar(100) DEFAULT NULL,
  nome varchar(255) DEFAULT NULL,
  telefone varchar(16) DEFAULT NULL,
  PRIMARY KEY (id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
CREATE TABLE livro (
  id int(5) NOT NULL AUTO_INCREMENT,
  isbn varchar(17) NOT NULL,
  titulo varchar(150) NOT NULL,
  edicao int(2) NOT NULL,
  autor_id int(5) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY isbn (isbn),
  KEY fk_autor (autor_id),
  CONSTRAINT fk_autor FOREIGN KEY (autor_id) REFERENCES autor (id)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
