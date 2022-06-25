CREATE DATABASE DB_DESBU;
USE DB_DESBU;


CREATE TABLE ANALISTA (
id_usuario  int not null PRIMARY KEY AUTO_INCREMENT,
nome_usuario varchar(50),
senha_usuario varchar(10),
acesso_usuario int(1)
);

CREATE TABLE CLIENTE (
id_cliente int not null PRIMARY KEY AUTO_INCREMENT,
Cnpj_cliente char(14),
nome_cliente varchar(50),
endereco_cliente varchar(50),
telefone_cliente char(11),
celular_cliente char(12),
email_cliente varchar(100)
);

CREATE TABLE CHAMADO (
id_chamado int not null PRIMARY KEY AUTO_INCREMENT,
descricao_chamado varchar(280),
estado_chamado int(1),
prioridade_chamado varchar(20),
descricao_encerramento varchar(280),
id_cliente int
);

ALTER TABLE CHAMADO ADD FOREIGN KEY(id_cliente) REFERENCES CLIENTE (id_cliente);
ALTER TABLE ANALISTA AUTO_INCREMENT=101;
ALTER TABLE CLIENTE AUTO_INCREMENT=1001;
ALTER TABLE CHAMADO AUTO_INCREMENT=2022001;

INSERT INTO ANALISTA (nome_usuario, senha_usuario, acesso_usuario) values ("admin","admin",'1');
INSERT INTO ANALISTA (nome_usuario, senha_usuario, acesso_usuario) values ("gabs","8080",'0');
INSERT INTO CLIENTE (Cnpj_cliente ,nome_cliente, endereco_cliente, telefone_cliente, celular_cliente, email_cliente) values ("09446842000146","Univerdade Anhembi Morumbi","Rua da Mooca 123, São Paulo","1140028922","1198933575","anhembi@morumbi.com");
