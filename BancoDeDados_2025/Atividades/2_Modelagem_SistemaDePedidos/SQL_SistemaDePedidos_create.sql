-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2025-09-30 12:51:32.997

-- tables
-- Table: Categoria
CREATE TABLE Categoria (
    cd_categoria int  NOT NULL,
    nm_categoria varchar(30)  NOT NULL,
    CONSTRAINT cd_categoria PRIMARY KEY (cd_categoria)
);

-- Table: Item_Pedido
CREATE TABLE Item_Pedido (
    qt_venda double(8,2)  NOT NULL,
    vl_venda double(8,2)  NOT NULL,
    Produto_cd_produto int  NOT NULL,
    Pedido_cd_pedido int  NOT NULL,
    CONSTRAINT Item_Pedido_pk PRIMARY KEY (Produto_cd_produto,Pedido_cd_pedido)
);

-- Table: Pedido
CREATE TABLE Pedido (
    cd_pedido int  NOT NULL,
    dt_emissao date  NOT NULL,
    vl_total double(10,2)  NOT NULL,
    CONSTRAINT Pedido_pk PRIMARY KEY (cd_pedido)
);

-- Table: Produto
CREATE TABLE Produto (
    cd_produto int  NOT NULL,
    nm_produto int  NOT NULL,
    qt_estoque int  NOT NULL,
    vl_produto double(10,2)  NOT NULL,
    Categoria_cd_categoria int  NOT NULL,
    CONSTRAINT Produto_pk PRIMARY KEY (cd_produto)
);

-- foreign keys
-- Reference: Item_Pedido_Pedido (table: Item_Pedido)
ALTER TABLE Item_Pedido ADD CONSTRAINT Item_Pedido_Pedido FOREIGN KEY Item_Pedido_Pedido (Pedido_cd_pedido)
    REFERENCES Pedido (cd_pedido);

-- Reference: Item_Pedido_Produto (table: Item_Pedido)
ALTER TABLE Item_Pedido ADD CONSTRAINT Item_Pedido_Produto FOREIGN KEY Item_Pedido_Produto (Produto_cd_produto)
    REFERENCES Produto (cd_produto);

-- Reference: Produto_Categoria (table: Produto)
ALTER TABLE Produto ADD CONSTRAINT Produto_Categoria FOREIGN KEY Produto_Categoria (Categoria_cd_categoria)
    REFERENCES Categoria (cd_categoria);

-- End of file.

