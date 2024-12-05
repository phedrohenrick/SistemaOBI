/* LógicoDeVdd (1): */

CREATE TABLE COMPETIDOR (
    DataNasc DATE,
    Email VARCHAR(55),
    Sexo CHAR(1),
    Nome VARCHAR(45),
    Matricula CHAR(16) PRIMARY KEY,
    FK_CIDADE_CodigoIBGE INT
);

CREATE TABLE INSCRICAO (
    Inscricao CHAR(7) PRIMARY KEY
);

CREATE TABLE TURMA (
    Turma CHAR(1),
    Sigla VARCHAR(10) PRIMARY KEY,
    Curso VARCHAR(40),
    Ano SMALLINT,
    Serie CHAR(1)
);

CREATE TABLE ESTADO (
    Sigla CHAR(2) PRIMARY KEY,
    Regiao VARCHAR(12)
);

CREATE TABLE CIDADE (
    CodigoIBGE INT PRIMARY KEY,
    Nome VARCHAR(30),
    FK_ESTADO_Sigla CHAR(2)
);

CREATE TABLE NOTAPROVA (
    Pontuacao SMALLINT,
    Classificacao SMALLINT,
    Classificado BOOLEAN,
    FK_MODALIDADENIVEL_Nome VARCHAR(12),
    FK_MODALIDADENIVEL_Nivel CHAR(6),
    FK_FASE_Nome CHAR(6)
);

CREATE TABLE EDICAO (
    Ano SMALLINT PRIMARY KEY,
    LinkRegulamento VARCHAR(100)
);

CREATE TABLE FASE (
    Informacoes VARCHAR(200),
    Nome CHAR(6) PRIMARY KEY
);

CREATE TABLE MODALIDADENIVEL (
    LinkRegulamento VARCHAR(100),
    Nome VARCHAR(12),
    Nivel CHAR(6),
    PRIMARY KEY (Nome, Nivel)
);

CREATE TABLE PARTICIPACAO (
    FK_COMPETIDOR_Matricula CHAR(16),
    FK_INSCRICAO_Inscricao CHAR(7),
    FK_EDICAO_Ano SMALLINT
);

CREATE TABLE tem (
    fk_TURMA_Sigla VARCHAR(10),
    fk_COMPETIDOR_Matricula CHAR(16),
    DataFim DATE
);
 
ALTER TABLE COMPETIDOR ADD CONSTRAINT FK_COMPETIDOR_2
    FOREIGN KEY (FK_CIDADE_CodigoIBGE)
    REFERENCES CIDADE (CodigoIBGE)
    ON DELETE CASCADE;
 
ALTER TABLE CIDADE ADD CONSTRAINT FK_CIDADE_2
    FOREIGN KEY (FK_ESTADO_Sigla)
    REFERENCES ESTADO (Sigla)
    ON DELETE CASCADE;
 
ALTER TABLE NOTAPROVA ADD CONSTRAINT FK_NOTAPROVA_1
    FOREIGN KEY (FK_MODALIDADENIVEL_Nome, FK_MODALIDADENIVEL_Nivel)
    REFERENCES MODALIDADENIVEL (Nome, Nivel)
    ON DELETE CASCADE;
 
ALTER TABLE NOTAPROVA ADD CONSTRAINT FK_NOTAPROVA_2
    FOREIGN KEY (FK_FASE_Nome)
    REFERENCES FASE (Nome)
    ON DELETE CASCADE;
 
ALTER TABLE PARTICIPACAO ADD CONSTRAINT FK_PARTICIPACAO_1
    FOREIGN KEY (FK_COMPETIDOR_Matricula)
    REFERENCES COMPETIDOR (Matricula)
    ON DELETE RESTRICT;
 
ALTER TABLE PARTICIPACAO ADD CONSTRAINT FK_PARTICIPACAO_2
    FOREIGN KEY (FK_INSCRICAO_Inscricao)
    REFERENCES INSCRICAO (Inscricao)
    ON DELETE RESTRICT;
 
ALTER TABLE PARTICIPACAO ADD CONSTRAINT FK_PARTICIPACAO_3
    FOREIGN KEY (FK_EDICAO_Ano)
    REFERENCES EDICAO (Ano)
    ON DELETE CASCADE;
 
ALTER TABLE tem ADD CONSTRAINT FK_tem_1
    FOREIGN KEY (fk_TURMA_Sigla)
    REFERENCES TURMA (Sigla)
    ON DELETE RESTRICT;
 
ALTER TABLE tem ADD CONSTRAINT FK_tem_2
    FOREIGN KEY (fk_COMPETIDOR_Matricula)
    REFERENCES COMPETIDOR (Matricula)
    ON DELETE SET NULL;