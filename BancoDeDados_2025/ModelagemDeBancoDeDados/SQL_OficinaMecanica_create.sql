-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2025-09-30 13:03:20.074

-- tables
-- Table: CategoriaPeca
CREATE TABLE CategoriaPeca (
    cd_categoria int  NOT NULL,
    nm_categoria int  NOT NULL,
    CONSTRAINT CategoriaPeca_pk PRIMARY KEY (cd_categoria)
);

-- Table: Cidade
CREATE TABLE Cidade (
    cd_cidade int  NOT NULL,
    nm_cidade varchar(30)  NOT NULL,
    cd_estado int  NOT NULL,
    CONSTRAINT Cidade_pk PRIMARY KEY (cd_cidade)
);

-- Table: Cliente
CREATE TABLE Cliente (
    cd_cliente int  NOT NULL,
    cd_dadoPessoal int  NOT NULL,
    CONSTRAINT Cliente_pk PRIMARY KEY (cd_cliente)
);

-- Table: DadosPessoal
CREATE TABLE DadosPessoal (
    cd_dadoPessoal int  NOT NULL,
    nm_Pessoa varchar(50)  NOT NULL,
    email varchar(50)  NOT NULL,
    telefone varchar(50)  NOT NULL,
    CONSTRAINT DadosPessoal_pk PRIMARY KEY (cd_dadoPessoal)
);

-- Table: DadosPessoalHasEndereco
CREATE TABLE DadosPessoalHasEndereco (
    Endereco_cd_encereco int  NOT NULL,
    DadosPessoal_cd_dadoPessoal int  NOT NULL,
    CONSTRAINT cd_DadoPessoalEndereco PRIMARY KEY (Endereco_cd_encereco,DadosPessoal_cd_dadoPessoal)
);

-- Table: Endereco
CREATE TABLE Endereco (
    cd_encereco int  NOT NULL,
    cep int  NOT NULL,
    nrm_endereco int  NOT NULL,
    rua varchar(30)  NOT NULL,
    bairro varchar(30)  NOT NULL,
    cd_cidade int  NOT NULL,
    CONSTRAINT Endereco_pk PRIMARY KEY (cd_encereco)
);

-- Table: Especialidade
CREATE TABLE Especialidade (
    cd_especialidade int  NOT NULL,
    nm_especialidade int  NOT NULL,
    CONSTRAINT Especialidade_pk PRIMARY KEY (cd_especialidade)
);

-- Table: Estado
CREATE TABLE Estado (
    cd_estado int  NOT NULL,
    nm_estado varchar(30)  NOT NULL,
    UF varchar(2)  NOT NULL,
    CONSTRAINT Estado_pk PRIMARY KEY (cd_estado)
);

-- Table: ItemOsPeca
CREATE TABLE ItemOsPeca (
    cd_peca int  NOT NULL,
    vl_peca double(8,2)  NOT NULL,
    qnt_peca int  NOT NULL,
    cd_ordemServico int  NOT NULL,
    CONSTRAINT cd_OrdemServicoPeca PRIMARY KEY (cd_peca)
);

-- Table: ItemOsServico
CREATE TABLE ItemOsServico (
    cd_OrdemServico int  NOT NULL,
    cd_servico int  NOT NULL,
    cd_profissional int  NOT NULL,
    cd_especialidade int  NOT NULL,
    qnt_servico int  NOT NULL,
    vl_servico double(8,2)  NOT NULL,
    CONSTRAINT cd_OrdemServicoServico PRIMARY KEY (cd_OrdemServico,cd_servico)
);

-- Table: Marca
CREATE TABLE Marca (
    cd_marca int  NOT NULL,
    nm_marca varchar(30)  NOT NULL,
    CONSTRAINT Marca_pk PRIMARY KEY (cd_marca)
);

-- Table: ModeloCarro
CREATE TABLE ModeloCarro (
    cd_modelo int  NOT NULL,
    nm_modeo varchar(30)  NOT NULL,
    cd_marca int  NOT NULL,
    CONSTRAINT ModeloCarro_pk PRIMARY KEY (cd_modelo)
);

-- Table: NotaFiscal
CREATE TABLE NotaFiscal (
    cd_notaFiscal int  NOT NULL,
    cd_ordemServico int  NOT NULL,
    cd_cliente int  NOT NULL,
    desc_nota varchar(100)  NOT NULL,
    vl_total double(8,2)  NOT NULL,
    CONSTRAINT NotaFiscal_pk PRIMARY KEY (cd_notaFiscal)
);

-- Table: OrdemDeServico
CREATE TABLE OrdemDeServico (
    cd_ordemServico int  NOT NULL,
    cd_veiculo int  NOT NULL,
    cd_cliente int  NOT NULL,
    CONSTRAINT OrdemDeServico_pk PRIMARY KEY (cd_ordemServico)
);

-- Table: Peca
CREATE TABLE Peca (
    cd_peca int  NOT NULL,
    nm_peca varchar(30)  NOT NULL,
    dsc_peca varchar(100)  NOT NULL,
    qnt_estoque int  NOT NULL,
    vlr_custo double(7,2)  NOT NULL,
    vlr_venda double(7,2)  NOT NULL,
    cd_categoria int  NOT NULL,
    CONSTRAINT Peca_pk PRIMARY KEY (cd_peca)
);

-- Table: Profissional
CREATE TABLE Profissional (
    cd_profissional int  NOT NULL,
    cd_dadoPessoal int  NOT NULL,
    CONSTRAINT Profissional_pk PRIMARY KEY (cd_profissional)
);

-- Table: ProfissionalHasEspecialidade
CREATE TABLE ProfissionalHasEspecialidade (
    cd_profissional int  NOT NULL,
    cd_especialidade int  NOT NULL,
    CONSTRAINT cd_ProfissionalEspecialidade PRIMARY KEY (cd_profissional,cd_especialidade)
);

-- Table: Servico
CREATE TABLE Servico (
    cd_servico int  NOT NULL,
    nm_servico varchar(30)  NOT NULL,
    desc_servico varchar(70)  NOT NULL,
    vl_servico double(6,2)  NOT NULL,
    tempoEstimado_servico time  NOT NULL,
    CONSTRAINT Servico_pk PRIMARY KEY (cd_servico)
);

-- Table: Veiculo
CREATE TABLE Veiculo (
    cd_veiculo int  NOT NULL,
    placa varchar(15)  NOT NULL,
    anoFabricacao varchar(4)  NOT NULL,
    cd_modelo int  NOT NULL,
    CONSTRAINT Veiculo_pk PRIMARY KEY (cd_veiculo)
);

-- foreign keys
-- Reference: Cidade_Estado (table: Cidade)
ALTER TABLE Cidade ADD CONSTRAINT Cidade_Estado FOREIGN KEY Cidade_Estado (cd_estado)
    REFERENCES Estado (cd_estado);

-- Reference: Cliente_DadosPessoal (table: Cliente)
ALTER TABLE Cliente ADD CONSTRAINT Cliente_DadosPessoal FOREIGN KEY Cliente_DadosPessoal (cd_dadoPessoal)
    REFERENCES DadosPessoal (cd_dadoPessoal);

-- Reference: DadosPessoal_Has_Endereco_DadosPessoal (table: DadosPessoalHasEndereco)
ALTER TABLE DadosPessoalHasEndereco ADD CONSTRAINT DadosPessoal_Has_Endereco_DadosPessoal FOREIGN KEY DadosPessoal_Has_Endereco_DadosPessoal (DadosPessoal_cd_dadoPessoal)
    REFERENCES DadosPessoal (cd_dadoPessoal);

-- Reference: Endereco_Cidade (table: Endereco)
ALTER TABLE Endereco ADD CONSTRAINT Endereco_Cidade FOREIGN KEY Endereco_Cidade (cd_cidade)
    REFERENCES Cidade (cd_cidade);

-- Reference: ItemOsPeca_OrdemDeServico (table: ItemOsPeca)
ALTER TABLE ItemOsPeca ADD CONSTRAINT ItemOsPeca_OrdemDeServico FOREIGN KEY ItemOsPeca_OrdemDeServico (cd_ordemServico)
    REFERENCES OrdemDeServico (cd_ordemServico);

-- Reference: ModeloCarro_Marca (table: ModeloCarro)
ALTER TABLE ModeloCarro ADD CONSTRAINT ModeloCarro_Marca FOREIGN KEY ModeloCarro_Marca (cd_marca)
    REFERENCES Marca (cd_marca);

-- Reference: NotaFiscal_Cliente (table: NotaFiscal)
ALTER TABLE NotaFiscal ADD CONSTRAINT NotaFiscal_Cliente FOREIGN KEY NotaFiscal_Cliente (cd_cliente)
    REFERENCES Cliente (cd_cliente);

-- Reference: NotaFiscal_OrdemDeServico (table: NotaFiscal)
ALTER TABLE NotaFiscal ADD CONSTRAINT NotaFiscal_OrdemDeServico FOREIGN KEY NotaFiscal_OrdemDeServico (cd_ordemServico)
    REFERENCES OrdemDeServico (cd_ordemServico);

-- Reference: OrdemDeServico_Cliente (table: OrdemDeServico)
ALTER TABLE OrdemDeServico ADD CONSTRAINT OrdemDeServico_Cliente FOREIGN KEY OrdemDeServico_Cliente (cd_cliente)
    REFERENCES Cliente (cd_cliente);

-- Reference: OrdemDeServico_Veiculo (table: OrdemDeServico)
ALTER TABLE OrdemDeServico ADD CONSTRAINT OrdemDeServico_Veiculo FOREIGN KEY OrdemDeServico_Veiculo (cd_veiculo)
    REFERENCES Veiculo (cd_veiculo);

-- Reference: OrdemHasPeca_Peca (table: ItemOsPeca)
ALTER TABLE ItemOsPeca ADD CONSTRAINT OrdemHasPeca_Peca FOREIGN KEY OrdemHasPeca_Peca (cd_peca)
    REFERENCES Peca (cd_peca);

-- Reference: OrdemHasServico_OrdemDeServico (table: ItemOsServico)
ALTER TABLE ItemOsServico ADD CONSTRAINT OrdemHasServico_OrdemDeServico FOREIGN KEY OrdemHasServico_OrdemDeServico (cd_OrdemServico)
    REFERENCES OrdemDeServico (cd_ordemServico);

-- Reference: OrdemHasServico_ProfissionalHasEspecialidade (table: ItemOsServico)
ALTER TABLE ItemOsServico ADD CONSTRAINT OrdemHasServico_ProfissionalHasEspecialidade FOREIGN KEY OrdemHasServico_ProfissionalHasEspecialidade (cd_profissional,cd_especialidade)
    REFERENCES ProfissionalHasEspecialidade (cd_profissional,cd_especialidade);

-- Reference: OrdemHasServico_Servico (table: ItemOsServico)
ALTER TABLE ItemOsServico ADD CONSTRAINT OrdemHasServico_Servico FOREIGN KEY OrdemHasServico_Servico (cd_servico)
    REFERENCES Servico (cd_servico);

-- Reference: Peca_CategoriaPeca (table: Peca)
ALTER TABLE Peca ADD CONSTRAINT Peca_CategoriaPeca FOREIGN KEY Peca_CategoriaPeca (cd_categoria)
    REFERENCES CategoriaPeca (cd_categoria);

-- Reference: Profissional_DadosPessoal (table: Profissional)
ALTER TABLE Profissional ADD CONSTRAINT Profissional_DadosPessoal FOREIGN KEY Profissional_DadosPessoal (cd_dadoPessoal)
    REFERENCES DadosPessoal (cd_dadoPessoal);

-- Reference: Profissional_Has_Especialidade_Especialidade (table: ProfissionalHasEspecialidade)
ALTER TABLE ProfissionalHasEspecialidade ADD CONSTRAINT Profissional_Has_Especialidade_Especialidade FOREIGN KEY Profissional_Has_Especialidade_Especialidade (cd_especialidade)
    REFERENCES Especialidade (cd_especialidade);

-- Reference: Profissional_Has_Especialidade_Profissional (table: ProfissionalHasEspecialidade)
ALTER TABLE ProfissionalHasEspecialidade ADD CONSTRAINT Profissional_Has_Especialidade_Profissional FOREIGN KEY Profissional_Has_Especialidade_Profissional (cd_profissional)
    REFERENCES Profissional (cd_profissional);

-- Reference: Table_11_Endereco (table: DadosPessoalHasEndereco)
ALTER TABLE DadosPessoalHasEndereco ADD CONSTRAINT Table_11_Endereco FOREIGN KEY Table_11_Endereco (Endereco_cd_encereco)
    REFERENCES Endereco (cd_encereco);

-- Reference: Veiculo_ModeloCarro (table: Veiculo)
ALTER TABLE Veiculo ADD CONSTRAINT Veiculo_ModeloCarro FOREIGN KEY Veiculo_ModeloCarro (cd_modelo)
    REFERENCES ModeloCarro (cd_modelo);

-- End of file.

