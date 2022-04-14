if exists (select * from  sysobjects where id =
object_id(N'[users]'))
drop table users
GO

CREATE TABLE [dbo].[users](
	[userid] [int] IDENTITY(100,1) NOT NULL,
	[firstname] [NVARCHAR](256) NOT NULL,
	[lastname] [NVARCHAR](256)  NOT NULL,
	[email] [NVARCHAR](256) NOT NULL,
	[emaildomain] [int] NOT NULL,
	[password] [NVARCHAR](256) NOT NULL CONSTRAINT DF_users_password DEFAULT '',
	[createdby] [int] NULL,
	[createddate] [datetime]  NULL,
	[modifiedby] [int]  NULL,
	[modifieddate] [datetime]  NULL,
	[status] [int] NOT NULL,
	[lastlogindate] [datetime] NULL,
	[invalidlogins] [int] NOT NULL CONSTRAINT DF_users_invalidlogins DEFAULT 0,
	[systemuser] [int] NULL  CONSTRAINT DF_users_systemuser DEFAULT 0,
	[telephone][NVARCHAR](256) NULL CONSTRAINT DF_users_telephone DEFAULT '',
	[bio] NVARCHAR(MAX) NOT NULL CONSTRAINT DF_users_bio DEFAULT '',
	[dateOfBirth] DATETIME NOT NULL CONSTRAINT DF_users_dateOfBirth DEFAULT '',
	[avatar] [int] NOT NULL CONSTRAINT DF_users_avatar DEFAULT 0,
	[avatarTypeID] [int] NOT NULL CONSTRAINT DF_users_avatarTypeID DEFAULT 0,
	[mobilePhone] [NVARCHAR](256) NOT NULL CONSTRAINT DF_users_mobilePhone DEFAULT '',
	[autoLogin] [INT] NOT NULL DEFAULT 0,
	[resetPasswordDate] DATETIME NOT NULL DEFAULT ''
 CONSTRAINT [PK_users] PRIMARY KEY CLUSTERED
(
	[userid] ASC
)WITH (IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO