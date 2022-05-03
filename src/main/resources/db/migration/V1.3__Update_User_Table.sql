USE collabtest;   
GO  
ALTER TABLE users   
ADD CONSTRAINT users_user_name UNIQUE (user_name);   
GO  

GO  
ALTER TABLE users   
ADD CONSTRAINT users_email UNIQUE (email);   
GO  