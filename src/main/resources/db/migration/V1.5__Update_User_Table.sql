IF COL_LENGTH('dbo.users', 'address_id') IS NULL
BEGIN
   ALTER TABLE dbo.users ADD address_id [int];
   ALTER TABLE dbo.users ADD FOREIGN KEY (FK_address_id) REFERENCES Users(address_id);
END