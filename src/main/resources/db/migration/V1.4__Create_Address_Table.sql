if exists (select * from  sysobjects where id = object_id(N'[address]'))
drop table address

GO
CREATE TABLE [dbo].[address](
	[address_id] [int] IDENTITY(100,1) NOT NULL,
	[address1] [NVARCHAR](256) NOT NULL,
	[address2] [NVARCHAR](256)  NOT NULL,
	[country] [NVARCHAR](50) NOT NULL,
	[state] [NVARCHAR](50)  NOT NULL,
	[pin_code] [NVARCHAR](50) NOT NULL,
 	CONSTRAINT [PK_address] 
 	PRIMARY KEY CLUSTERED([address_id] ASC )
 	WITH (IGNORE_DUP_KEY = OFF) 
 	ON [PRIMARY]
 	) ON [PRIMARY]
GO