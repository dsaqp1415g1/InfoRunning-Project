drop database if exists Inforunningdb;
create database Inforunningdb;

use Inforunningdb;

create table users (
	username	varchar(20) not null primary key,
	password	char(32) not null,
	name		varchar(70) not null,
	email		varchar(255) not null
);


create table news (
	newsid				int not null auto_increment primary key,
	new					varchar(500) not null,
	url					varchar(500) not null,
	creation_timestamp		datetime not null default current_timestamp
);


create table event (
	eventid				int not null auto_increment primary key,
	event					varchar(500) not null,
	url					varchar(500) not null,
	expire_time		datetime not null
);

create table comment (
	commentid			int not null auto_increment primary key,
	username			varchar(20) not null,
	coment				varchar(240) not null,
	newsid				int not null
	creation_timestamp		datetime not null default current_timestamp,
	foreign key(username) 	references users(username),
	foreign key(newsid)		references news(newsid)
);

create table follow (
	eventid				int not null,
	username	varchar(20) not null,
	foreign key(username) 	references users(username),
	foreign key(eventid)	references event(eventid)
);


