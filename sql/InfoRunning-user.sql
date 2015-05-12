drop user 'Inforunning'@'localhost';
create user 'Inforunning'@'localhost' identified by 'Inforunning
grant all privileges on Inforunningdb.* to 'Inforunning'@'localhost';
GRANT SUPER ON *.* TO Inforunning@'localhost' IDENTIFIED BY 'Inforunning';
flush privileges;