--Ej1
drop table if exists producto CASCADE;
drop table if exists categoria CASCADE;
drop sequence if exists hibernate_sequence;
create sequence hibernate_sequence start with 1 increment by 1;
create table producto (id bigint not null, nombre varchar(255), pvp double, categoria_id bigint, primary key (id));
create table categoria (id bigint not null, nombre varchar(255), primary key (id));
alter table producto add constraint FKojks48ahsqwkx9o2s7pl0212p foreign key (categoria_id) references categoria;

--Ej2
drop table if exists profesor CASCADE;
drop table if exists cursoOnline CASCADE;
drop table if exists video CASCADE;
drop sequence if exists hibernate_sequence;
create sequence hibernate_sequence start with 1 increment by 1;
create table profesor (id bigint not null, nombre varchar(255), email varchar(255), primary key (id));
create table cursoOnline (id bigint not null, nombre varchar(255), puntuacion double, profesor_id bigint, primary key (id));
create table video (id bigint not null, orden int, titulo varchar(255), descripcion varchar(255), url varchar(255), cursoOnline_id bigint,primary key (id));
alter table cursoOnline add constraint FKojks48ahsqwkx9o2s7pl0212p foreign key (profesor_id) references profesor;
alter table video add constraint FKojks48ahsqwkx9o2s7pl0212p foreign key (cursoOnline_id) references cursoOnline;