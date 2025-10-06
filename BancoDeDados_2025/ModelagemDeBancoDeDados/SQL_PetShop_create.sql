-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2025-09-30 13:09:34.453

-- tables
-- Table: Agendamento
CREATE TABLE Agendamento (
    cd_agendamento int  NOT NULL,
    cd_animal int  NOT NULL,
    cd_prestador int  NOT NULL,
    cd_servico int  NOT NULL,
    dthr_agendamento datetime  NOT NULL,
    CONSTRAINT Agendamento_pk PRIMARY KEY (cd_agendamento)
);

-- Table: Animal
CREATE TABLE Animal (
    cd_animal int  NOT NULL,
    cd_raca int  NOT NULL,
    cd_porte int  NOT NULL,
    cd_cliente int  NOT NULL,
    nm_animal varchar(30)  NOT NULL,
    desc_animal varchar(30)  NOT NULL,
    dt_nascimento date  NOT NULL,
    CONSTRAINT Animal_pk PRIMARY KEY (cd_animal)
);

-- Table: CategoriaProduto
CREATE TABLE CategoriaProduto (
    cd_categoria int  NOT NULL,
    nm_categoria varchar(30)  NOT NULL,
    CONSTRAINT CategoriaProduto_pk PRIMARY KEY (cd_categoria)
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
    cd_dadosPessoais int  NOT NULL,
    CONSTRAINT Cliente_pk PRIMARY KEY (cd_cliente)
);

-- Table: DadosPessoais
CREATE TABLE DadosPessoais (
    cd_dadosPessoais int  NOT NULL,
    nm_pessoa varchar(30)  NOT NULL,
    telefone varchar(30)  NOT NULL,
    email varchar(30)  NOT NULL,
    dt_nascimento date  NOT NULL,
    CONSTRAINT DadosPessoais_pk PRIMARY KEY (cd_dadosPessoais)
);

-- Table: DadosPessoaisHasEndereco
CREATE TABLE DadosPessoaisHasEndereco (
    cd_endereco int  NOT NULL,
    cd_dadosPessoais int  NOT NULL,
    CONSTRAINT DadosPessoaisHasEndereco_pk PRIMARY KEY (cd_endereco)
);

-- Table: Endereco
CREATE TABLE Endereco (
    cd_endereco int  NOT NULL,
    cep int  NOT NULL,
    nrm_endereco int  NOT NULL,
    nm_rua varchar(30)  NOT NULL,
    nm_bairro varchar(30)  NOT NULL,
    cd_cidade int  NOT NULL,
    CONSTRAINT Endereco_pk PRIMARY KEY (cd_endereco)
);

-- Table: Especie
CREATE TABLE Especie (
    cd_especie int  NOT NULL,
    nm_especie varchar(30)  NOT NULL,
    CONSTRAINT Especie_pk PRIMARY KEY (cd_especie)
);

-- Table: Estado
CREATE TABLE Estado (
    cd_estado int  NOT NULL,
    nm_estado varchar(30)  NOT NULL,
    UF varchar(2)  NOT NULL,
    CONSTRAINT Estado_pk PRIMARY KEY (cd_estado)
);

-- Table: ItemNotaFiscal
CREATE TABLE ItemNotaFiscal (
    cd_itemNF int  NOT NULL,
    cd_notaFiscal int  NOT NULL,
    cd_produto int  NOT NULL,
    qnt_itemNF int  NOT NULL,
    vl_itemNF double(10,2)  NOT NULL,
    vl_totalItemNF double(10,2)  NOT NULL,
    CONSTRAINT ItemNotaFiscal_pk PRIMARY KEY (cd_itemNF)
);

-- Table: NotaFiscal
CREATE TABLE NotaFiscal (
    cd_notaFiscal int  NOT NULL,
    cd_cliente int  NOT NULL,
    dt_emissao datetime  NOT NULL,
    vl_totalNF double(10,2)  NOT NULL,
    CONSTRAINT NotaFiscal_pk PRIMARY KEY (cd_notaFiscal)
);

-- Table: Porte
CREATE TABLE Porte (
    cd_porte int  NOT NULL,
    nm_porte varchar(30)  NOT NULL,
    CONSTRAINT Porte_pk PRIMARY KEY (cd_porte)
);

-- Table: Prestador
CREATE TABLE Prestador (
    cd_prestador int  NOT NULL,
    cd_dadosPessoais int  NOT NULL,
    CONSTRAINT Prestador_pk PRIMARY KEY (cd_prestador)
);

-- Table: PrestadorServico
CREATE TABLE PrestadorServico (
    cd_prestador int  NOT NULL,
    cd_servico int  NOT NULL,
    vl_servico double(10,2)  NOT NULL,
    CONSTRAINT PrestadorServico_pk PRIMARY KEY (cd_prestador,cd_servico)
);

-- Table: Produto
CREATE TABLE Produto (
    cd_produto int  NOT NULL,
    nm_produto varchar(30)  NOT NULL,
    desc_produto varchar(60)  NOT NULL,
    vl_custo double(8,2)  NOT NULL,
    vl_venda double(8,2)  NOT NULL,
    qnt_estoque int  NOT NULL,
    cd_categoria int  NOT NULL,
    CONSTRAINT Produto_pk PRIMARY KEY (cd_produto)
);

-- Table: Raca
CREATE TABLE Raca (
    cd_raca int  NOT NULL,
    nm_raca varchar(30)  NOT NULL,
    cd_especie int  NOT NULL,
    CONSTRAINT Raca_pk PRIMARY KEY (cd_raca)
);

-- Table: Servico
CREATE TABLE Servico (
    cd_servico int  NOT NULL,
    nm_servico varchar(30)  NOT NULL,
    CONSTRAINT Servico_pk PRIMARY KEY (cd_servico)
);

-- foreign keys
-- Reference: Agendamento_Animal (table: Agendamento)
ALTER TABLE Agendamento ADD CONSTRAINT Agendamento_Animal FOREIGN KEY Agendamento_Animal (cd_animal)
    REFERENCES Animal (cd_animal);

-- Reference: Agendamento_PrestadorServico (table: Agendamento)
ALTER TABLE Agendamento ADD CONSTRAINT Agendamento_PrestadorServico FOREIGN KEY Agendamento_PrestadorServico (cd_prestador,cd_servico)
    REFERENCES PrestadorServico (cd_prestador,cd_servico);

-- Reference: Animal_Cliente (table: Animal)
ALTER TABLE Animal ADD CONSTRAINT Animal_Cliente FOREIGN KEY Animal_Cliente (cd_cliente)
    REFERENCES Cliente (cd_cliente);

-- Reference: Animal_Porte (table: Animal)
ALTER TABLE Animal ADD CONSTRAINT Animal_Porte FOREIGN KEY Animal_Porte (cd_porte)
    REFERENCES Porte (cd_porte);

-- Reference: Animal_Raca (table: Animal)
ALTER TABLE Animal ADD CONSTRAINT Animal_Raca FOREIGN KEY Animal_Raca (cd_raca)
    REFERENCES Raca (cd_raca);

-- Reference: Cidade_Estado (table: Cidade)
ALTER TABLE Cidade ADD CONSTRAINT Cidade_Estado FOREIGN KEY Cidade_Estado (cd_estado)
    REFERENCES Estado (cd_estado);

-- Reference: ClienteHasEndereco_Endereco (table: DadosPessoaisHasEndereco)
ALTER TABLE DadosPessoaisHasEndereco ADD CONSTRAINT ClienteHasEndereco_Endereco FOREIGN KEY ClienteHasEndereco_Endereco (cd_endereco)
    REFERENCES Endereco (cd_endereco);

-- Reference: Cliente_DadosPessoais (table: Cliente)
ALTER TABLE Cliente ADD CONSTRAINT Cliente_DadosPessoais FOREIGN KEY Cliente_DadosPessoais (cd_dadosPessoais)
    REFERENCES DadosPessoais (cd_dadosPessoais);

-- Reference: DadosPessoaisHasEndereco_DadosPessoais (table: DadosPessoaisHasEndereco)
ALTER TABLE DadosPessoaisHasEndereco ADD CONSTRAINT DadosPessoaisHasEndereco_DadosPessoais FOREIGN KEY DadosPessoaisHasEndereco_DadosPessoais (cd_dadosPessoais)
    REFERENCES DadosPessoais (cd_dadosPessoais);

-- Reference: Endereco_Cidade (table: Endereco)
ALTER TABLE Endereco ADD CONSTRAINT Endereco_Cidade FOREIGN KEY Endereco_Cidade (cd_cidade)
    REFERENCES Cidade (cd_cidade);

-- Reference: ItemNotaFiscal_NotaFiscal (table: ItemNotaFiscal)
ALTER TABLE ItemNotaFiscal ADD CONSTRAINT ItemNotaFiscal_NotaFiscal FOREIGN KEY ItemNotaFiscal_NotaFiscal (cd_notaFiscal)
    REFERENCES NotaFiscal (cd_notaFiscal);

-- Reference: ItemNotaFiscal_Produto (table: ItemNotaFiscal)
ALTER TABLE ItemNotaFiscal ADD CONSTRAINT ItemNotaFiscal_Produto FOREIGN KEY ItemNotaFiscal_Produto (cd_produto)
    REFERENCES Produto (cd_produto);

-- Reference: NotaFiscal_Cliente (table: NotaFiscal)
ALTER TABLE NotaFiscal ADD CONSTRAINT NotaFiscal_Cliente FOREIGN KEY NotaFiscal_Cliente (cd_cliente)
    REFERENCES Cliente (cd_cliente);

-- Reference: PrestadorServico_DadosPessoais (table: Prestador)
ALTER TABLE Prestador ADD CONSTRAINT PrestadorServico_DadosPessoais FOREIGN KEY PrestadorServico_DadosPessoais (cd_dadosPessoais)
    REFERENCES DadosPessoais (cd_dadosPessoais);

-- Reference: PrestadorServico_Prestador (table: PrestadorServico)
ALTER TABLE PrestadorServico ADD CONSTRAINT PrestadorServico_Prestador FOREIGN KEY PrestadorServico_Prestador (cd_prestador)
    REFERENCES Prestador (cd_prestador);

-- Reference: PrestadorServico_Servico (table: PrestadorServico)
ALTER TABLE PrestadorServico ADD CONSTRAINT PrestadorServico_Servico FOREIGN KEY PrestadorServico_Servico (cd_servico)
    REFERENCES Servico (cd_servico);

-- Reference: Produto_CategoriaProduto (table: Produto)
ALTER TABLE Produto ADD CONSTRAINT Produto_CategoriaProduto FOREIGN KEY Produto_CategoriaProduto (cd_categoria)
    REFERENCES CategoriaProduto (cd_categoria);

-- Reference: Raca_Especie (table: Raca)
ALTER TABLE Raca ADD CONSTRAINT Raca_Especie FOREIGN KEY Raca_Especie (cd_especie)
    REFERENCES Especie (cd_especie);

-- End of file.

