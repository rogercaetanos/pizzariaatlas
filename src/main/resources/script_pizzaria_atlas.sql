USE master;

IF exists (SELECT * FROM SYS.databases WHERE name= 'pizzariaatlasdb')
   DROP DATABASE pizzariaatlasdb
GO

CREATE DATABASE pizzariaatlasdb
GO

USE pizzariaatlasdb
GO

CREATE TABLE Usuario (

  id BIGINT NOT NULL IDENTITY(1,1) PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  cpf VARCHAR(15) NULL,
  data_nascimento DATE NULL,
  email VARCHAR(45) NOT NULL,
  password VARCHAR(255) NOT NULL,
  sexo VARCHAR(20) NULL,
  logradouro VARCHAR(45) NULL,
  cep VARCHAR(12) NULL,
  bairro VARCHAR(45) NULL,
  cidade VARCHAR(45) NULL,
  uf CHAR(2) NULL,
  cod_status BIT NOT NULL,
  tipo_usuario VARCHAR(20) NOT NULL,
  nivel_acesso VARCHAR(10) NULL,
  cnh VARCHAR(15) NULL,
  numero_pontos INT

)

CREATE TABLE Pedido (

  id BIGINT NOT NULL IDENTITY(1,1) PRIMARY KEY,
  numero_pedido VARCHAR(10) NOT NULL,
  valor_pedido DECIMAL(5,2) NOT NULL,
  data_hora_pedido DATETIME NOT NULL,
  data_hora_entrega DATETIME NULL,
  status VARCHAR(30) NOT NULL,
  cod_status BIT,
  cliente_id BIGINT NOT NULL,
  CONSTRAINT fk_pedido_usuario_id FOREIGN KEY (cliente_id) REFERENCES Usuario(id)

)

