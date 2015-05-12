source InfoRunning-schema.sql;

insert into users values('admin', MD5('admin'), 'admin', 'admin@mail.com');
insert into user_roles values ('admin', 'administrador');

insert into users values('alex', MD5('alex'), 'alex', 'alex@mail.com');
insert into user_roles values ('alex', 'registered');

insert into users values('sergi', MD5('sergi'), 'sergi', 'sergi@mail.com');
insert into user_roles values ('sergi', 'registered');

insert into users values('carol', MD5('carol'), 'carol', 'carol@mail.com');
insert into user_roles values ('carol', 'registered');

insert into news values('1', 'Calentaminto para running', 'www.laurl.com', '');
insert into news value('2', 'Dieta Sana', 'www.laurl2.com', '');
insert into news values('3', 'Tacticas para correr', 'www.laurl3.com', '');
 
insert into event values('1', 'Colorrun', 'www.laurl.com', '');
insert into event values('2', 'Carrera de la Mujer', 'www.laurl.com', '');
insert into event values('3', 'Carrera del Corte Ingles', 'www.laurl.com', '');