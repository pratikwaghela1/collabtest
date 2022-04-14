if exists (select * from  sysobjects where id =
object_id(N'[users]'))
drop table users
GO

CREATE TABLE [dbo].[users](
	[user_id] [int] IDENTITY(100,1) NOT NULL,
	[first_name] [NVARCHAR](256) NOT NULL,
	[last_name] [NVARCHAR](256)  NOT NULL,
	[age] [int] NOT NULL,
	[gender] [NVARCHAR](1)  NOT NULL,
	[password] [NVARCHAR](256) NOT NULL CONSTRAINT DF_users_password DEFAULT '',
 CONSTRAINT [PK_users] PRIMARY KEY CLUSTERED
(
	[user_id] ASC
)WITH (IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

INSERT INTO users(first_name,last_name,age,gender,password) values ('John', 'Doe',25,'M','1234');
INSERT INTO users(first_name,last_name,age,gender,password) values ('Jane', 'Doe',23,'F','1234');
INSERT INTO users(first_name,last_name,age,gender,password) values ('Sarah', 'Bosch',34,'F','1234');
INSERT INTO users(first_name,last_name,age,gender,password) values ('Michael', 'Murray',20,'M','1234');
INSERT INTO users(first_name,last_name,age,gender,password) values ('Daisy', 'Chen',19,'F','1234');
INSERT INTO users(first_name,last_name,age,gender,password) values ('May', 'Williams',15,'M','1234');
INSERT INTO users(first_name,last_name,age,gender,password) values ('Alex', 'Johnson',40,'M','1234');


