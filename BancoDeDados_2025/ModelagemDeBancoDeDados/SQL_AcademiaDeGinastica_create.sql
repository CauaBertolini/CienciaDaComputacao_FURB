-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2025-09-30 12:49:20.372

-- tables
-- Table: Aluno
CREATE TABLE Aluno (
    cd_aluno int  NOT NULL,
    atividadeProfissional varchar(30)  NOT NULL,
    DadosPessoais_cd_dadosPessoais int  NOT NULL,
    Endereco_cd_endereco int  NOT NULL,
    Escolaridade_cd_escolaridade int  NOT NULL,
    Plano_cd_plano int  NOT NULL,
    CONSTRAINT Aluno_pk PRIMARY KEY (cd_aluno)
);

-- Table: Aluno_Has_Turma
CREATE TABLE Aluno_Has_Turma (
    Aluno_cd_aluno int  NOT NULL,
    Turma_cd_turma int  NOT NULL,
    CONSTRAINT cd_aluno_turma PRIMARY KEY (Aluno_cd_aluno,Turma_cd_turma)
);

-- Table: Atividade
CREATE TABLE Atividade (
    cd_atividade int  NOT NULL,
    Turma_cd_turma int  NOT NULL,
    CONSTRAINT Atividade_pk PRIMARY KEY (cd_atividade)
);

-- Table: Cartao
CREATE TABLE Cartao (
    cd_cartao int  NOT NULL,
    Aluno_cd_aluno int  NOT NULL,
    CONSTRAINT Cartao_pk PRIMARY KEY (cd_cartao)
);

-- Table: DadosPessoais
CREATE TABLE DadosPessoais (
    cd_dadosPessoais int  NOT NULL,
    nm_pessoa varchar(50)  NOT NULL,
    email varchar(50)  NOT NULL,
    telefone varchar(50)  NOT NULL,
    dt_nascimento date  NOT NULL,
    peso double(3,2)  NOT NULL,
    altura double(3,2)  NOT NULL,
    Genero_cd_genero int  NOT NULL,
    CONSTRAINT DadosPessoais_pk PRIMARY KEY (cd_dadosPessoais)
);

-- Table: DiaSemana
CREATE TABLE DiaSemana (
    cd_diaSemana int  NOT NULL,
    nm_diaSemana varchar(30)  NOT NULL,
    CONSTRAINT DiaSemana_pk PRIMARY KEY (cd_diaSemana)
);

-- Table: Endereco
CREATE TABLE Endereco (
    cd_endereco int  NOT NULL,
    nrm_cep int  NOT NULL,
    nrm_casa int  NOT NULL,
    nm_rua varchar(30)  NOT NULL,
    nm_bairro varchar(30)  NOT NULL,
    nm_cidade varchar(30)  NOT NULL,
    uf varchar(30)  NOT NULL,
    complemento varchar(50)  NOT NULL,
    CONSTRAINT Endereco_pk PRIMARY KEY (cd_endereco)
);

-- Table: Escolaridade
CREATE TABLE Escolaridade (
    cd_escolaridade int  NOT NULL,
    nm_escolaridade varchar(30)  NOT NULL,
    CONSTRAINT Escolaridade_pk PRIMARY KEY (cd_escolaridade)
);

-- Table: Genero
CREATE TABLE Genero (
    cd_genero int  NOT NULL,
    nm_genero varchar(50)  NOT NULL,
    CONSTRAINT Genero_pk PRIMARY KEY (cd_genero)
);

-- Table: Instrutor
CREATE TABLE Instrutor (
    cd_instrutor int  NOT NULL,
    DadosPessoais_cd_dadosPessoais int  NOT NULL,
    Endereco_cd_endereco int  NOT NULL,
    CONSTRAINT Instrutor_pk PRIMARY KEY (cd_instrutor)
);

-- Table: Modalidade
CREATE TABLE Modalidade (
    cd_modalidade int  NOT NULL,
    nm_modalidade varchar(40)  NOT NULL,
    CONSTRAINT Modalidade_pk PRIMARY KEY (cd_modalidade)
);

-- Table: Modalidade_Has_Instrutor
CREATE TABLE Modalidade_Has_Instrutor (
    Modalidade_cd_modalidade int  NOT NULL,
    Instrutor_cd_instrutor int  NOT NULL,
    CONSTRAINT cd_modalidade_instrutor PRIMARY KEY (Modalidade_cd_modalidade,Instrutor_cd_instrutor)
);

-- Table: Plano
CREATE TABLE Plano (
    cd_plano int  NOT NULL,
    nm_plano varchar(50)  NOT NULL,
    vl_mensal double(10,2)  NOT NULL,
    vl_trimestral double(10,2)  NOT NULL,
    vl_semestral double(10,2)  NOT NULL,
    vl_anual double(10,2)  NOT NULL,
    qnt_turmas int  NOT NULL,
    CONSTRAINT Plano_pk PRIMARY KEY (cd_plano)
);

-- Table: Presenca
CREATE TABLE Presenca (
    cd_presenca int  NOT NULL,
    dt_presenca datetime  NOT NULL,
    Atividade_cd_atividade int  NOT NULL,
    Cartao_cd_cartao int  NOT NULL,
    CONSTRAINT Presenca_pk PRIMARY KEY (cd_presenca)
);

-- Table: Turma
CREATE TABLE Turma (
    cd_turma int  NOT NULL,
    DiaSemana_cd_diaSemana int  NOT NULL,
    nrm_vagas int  NOT NULL,
    horaInicio time  NOT NULL,
    duracao time  NOT NULL,
    desc_turma varchar(50)  NOT NULL,
    Modalidade_Has_Instrutor_Modalidade_cd_modalidade int  NOT NULL,
    Modalidade_Has_Instrutor_Instrutor_cd_instrutor int  NOT NULL,
    CONSTRAINT Turma_pk PRIMARY KEY (cd_turma)
);

-- foreign keys
-- Reference: Aluno_DadosPessoais (table: Aluno)
ALTER TABLE Aluno ADD CONSTRAINT Aluno_DadosPessoais FOREIGN KEY Aluno_DadosPessoais (DadosPessoais_cd_dadosPessoais)
    REFERENCES DadosPessoais (cd_dadosPessoais);

-- Reference: Aluno_Endereco (table: Aluno)
ALTER TABLE Aluno ADD CONSTRAINT Aluno_Endereco FOREIGN KEY Aluno_Endereco (Endereco_cd_endereco)
    REFERENCES Endereco (cd_endereco);

-- Reference: Aluno_Escolaridade (table: Aluno)
ALTER TABLE Aluno ADD CONSTRAINT Aluno_Escolaridade FOREIGN KEY Aluno_Escolaridade (Escolaridade_cd_escolaridade)
    REFERENCES Escolaridade (cd_escolaridade);

-- Reference: Aluno_Has_Turma_Aluno (table: Aluno_Has_Turma)
ALTER TABLE Aluno_Has_Turma ADD CONSTRAINT Aluno_Has_Turma_Aluno FOREIGN KEY Aluno_Has_Turma_Aluno (Aluno_cd_aluno)
    REFERENCES Aluno (cd_aluno);

-- Reference: Aluno_Has_Turma_Turma (table: Aluno_Has_Turma)
ALTER TABLE Aluno_Has_Turma ADD CONSTRAINT Aluno_Has_Turma_Turma FOREIGN KEY Aluno_Has_Turma_Turma (Turma_cd_turma)
    REFERENCES Turma (cd_turma);

-- Reference: Aluno_Plano (table: Aluno)
ALTER TABLE Aluno ADD CONSTRAINT Aluno_Plano FOREIGN KEY Aluno_Plano (Plano_cd_plano)
    REFERENCES Plano (cd_plano);

-- Reference: Atividade_Turma (table: Atividade)
ALTER TABLE Atividade ADD CONSTRAINT Atividade_Turma FOREIGN KEY Atividade_Turma (Turma_cd_turma)
    REFERENCES Turma (cd_turma);

-- Reference: Cartao_Aluno (table: Cartao)
ALTER TABLE Cartao ADD CONSTRAINT Cartao_Aluno FOREIGN KEY Cartao_Aluno (Aluno_cd_aluno)
    REFERENCES Aluno (cd_aluno);

-- Reference: DadosPessoais_Genero (table: DadosPessoais)
ALTER TABLE DadosPessoais ADD CONSTRAINT DadosPessoais_Genero FOREIGN KEY DadosPessoais_Genero (Genero_cd_genero)
    REFERENCES Genero (cd_genero);

-- Reference: Instrutor_DadosPessoais (table: Instrutor)
ALTER TABLE Instrutor ADD CONSTRAINT Instrutor_DadosPessoais FOREIGN KEY Instrutor_DadosPessoais (DadosPessoais_cd_dadosPessoais)
    REFERENCES DadosPessoais (cd_dadosPessoais);

-- Reference: Instrutor_Endereco (table: Instrutor)
ALTER TABLE Instrutor ADD CONSTRAINT Instrutor_Endereco FOREIGN KEY Instrutor_Endereco (Endereco_cd_endereco)
    REFERENCES Endereco (cd_endereco);

-- Reference: Modalidade_Instrutor_Instrutor (table: Modalidade_Has_Instrutor)
ALTER TABLE Modalidade_Has_Instrutor ADD CONSTRAINT Modalidade_Instrutor_Instrutor FOREIGN KEY Modalidade_Instrutor_Instrutor (Instrutor_cd_instrutor)
    REFERENCES Instrutor (cd_instrutor);

-- Reference: Modalidade_Instrutor_Modalidade (table: Modalidade_Has_Instrutor)
ALTER TABLE Modalidade_Has_Instrutor ADD CONSTRAINT Modalidade_Instrutor_Modalidade FOREIGN KEY Modalidade_Instrutor_Modalidade (Modalidade_cd_modalidade)
    REFERENCES Modalidade (cd_modalidade);

-- Reference: Presenca_Atividade (table: Presenca)
ALTER TABLE Presenca ADD CONSTRAINT Presenca_Atividade FOREIGN KEY Presenca_Atividade (Atividade_cd_atividade)
    REFERENCES Atividade (cd_atividade);

-- Reference: Presenca_Cartao (table: Presenca)
ALTER TABLE Presenca ADD CONSTRAINT Presenca_Cartao FOREIGN KEY Presenca_Cartao (Cartao_cd_cartao)
    REFERENCES Cartao (cd_cartao);

-- Reference: Turma_DiaSemana (table: Turma)
ALTER TABLE Turma ADD CONSTRAINT Turma_DiaSemana FOREIGN KEY Turma_DiaSemana (DiaSemana_cd_diaSemana)
    REFERENCES DiaSemana (cd_diaSemana);

-- Reference: Turma_Modalidade_Has_Instrutor (table: Turma)
ALTER TABLE Turma ADD CONSTRAINT Turma_Modalidade_Has_Instrutor FOREIGN KEY Turma_Modalidade_Has_Instrutor (Modalidade_Has_Instrutor_Modalidade_cd_modalidade,Modalidade_Has_Instrutor_Instrutor_cd_instrutor)
    REFERENCES Modalidade_Has_Instrutor (Modalidade_cd_modalidade,Instrutor_cd_instrutor);

-- End of file.

