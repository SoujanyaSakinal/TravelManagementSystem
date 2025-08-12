create database travelmanagementsystem;
show databases;
use travelmanagementsystem;

select *from account;

show tables;
create table customer(username varchar(30), id varchar(30), number varchar(30), name varchar(30), gender varchar(30), country varchar(30), address varchar(70), phone varchar(10), email varchar(40));
select *from customer;

create table bookpackage(username varchar(30),package varchar(30),persons varchar(20),id varchar(30),number varchar(30),phone varchar(20),price varchar(20));
select *from bookpackage;

create table hotel(name varchar(30), costperperson varchar(30), acroom varchar(10), foodincluded varchar(10));
insert into hotel values('Raddison Blue Hotel','3400','1000','1700');
insert into hotel values('Taj Hotel','10000','1500','2000');
insert into hotel values('Hotel Vintage','5000','1000','1000');
select *from hotel;

create table bookhotel(username varchar(20), name varchar(30), persons varchar(10),days varchar(10), ac varchar(10), food varchar(10), id varchar(20), number varchar(20),phone varchar(20), price varchar(20));
select *from bookhotel;


create table finalbook(username varchar(30),package varchar(30),destination varchar(30),persons varchar(20),date varchar(30),id varchar(30),number varchar(30),phone varchar(20),price varchar(20));
select *from finalbook;
drop table finalbook;
describe finalbook;



