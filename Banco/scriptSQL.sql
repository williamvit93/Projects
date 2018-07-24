
CREATE TABLE [dbo].[Clientes] (
    [Id]       INT            IDENTITY (1, 1) NOT NULL,
    [Nome]     VARCHAR (MAX)  NOT NULL,
    [Cpf]      VARCHAR (MAX)  NOT NULL,
    [Rg]       NVARCHAR (MAX) NULL,
    [Endereco] NVARCHAR (MAX) NULL,
    [Idade]    INT            NULL
);

CREATE TABLE [dbo].[TiposConta] (
    [Id]        INT           NOT NULL,
    [descricao] VARCHAR (MAX) NOT NULL
);


CREATE TABLE [dbo].[Contas] (
    [numero]      INT        IDENTITY (1000, 1) NOT NULL,
    [clienteid]   INT        NOT NULL,
    [Saldo]       FLOAT (53) NULL,
    [TipoContaid] INT        NOT NULL
);





