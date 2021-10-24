
--Datos EJ1
--Categorías
insert into categoria (id, nombre, categoriaPadreId)
values (NEXTVAL('HIBERNATE_SEQUENCE'), 'Electronica', null);

insert into categoria (id, nombre, categoriaPadreId)
values (NEXTVAL('HIBERNATE_SEQUENCE'), 'Ropa', null);

insert into categoria (id, nombre, categoriaPadreId)
values (NEXTVAL('HIBERNATE_SEQUENCE'), 'Electrodomesticos', 1L);

insert into categoria (id, nombre, categoriaPadreId)
values (NEXTVAL('HIBERNATE_SEQUENCE'), 'Ordenadores', 1L);

--Productos
insert into producto (id, nombre, pvp, categoria)
values (NEXTVAL('HIBERNATE_SEQUENCE'), 'Lavadora', 159.99, 3);

insert into producto (id, nombre, pvp, categoria)
values (NEXTVAL('HIBERNATE_SEQUENCE'), 'Aire acondicionado', 299.99, 3);

insert into producto (id, nombre, pvp, categoria)
values (NEXTVAL('HIBERNATE_SEQUENCE'), 'Prestige 14Evo A11M-003ES', 859.99, 4);

insert into producto (id, nombre, pvp, categoria)
values (NEXTVAL('HIBERNATE_SEQUENCE'), 'Chaqueta Vaquera', 19.99, 2);

--Datos Ej2
--Profesor
insert into profesor (id, nombre, email, puntuacion)
values (NEXTVAL('HIBERNATE_SEQUENCE'), 'Juan José Martínez', 'jujoma89@gmail.com', 7.6);

insert into profesor (id, nombre, email, puntuacion)
values (NEXTVAL('HIBERNATE_SEQUENCE'), 'Marcos Pérez Jiménez', 'mapeji92@gmail.com', 9.8);

insert into profesor (id, nombre, email, puntuacion)
values (NEXTVAL('HIBERNATE_SEQUENCE'), 'Roberto González Hernán', 'rogohe90@gmail.com', 7.2);

--CursoOnline
insert into cursoOnline (id, nombre, puntuacion, profesor_id)
values (NEXTVAL('HIBERNATE_SEQUENCE'), 'Iniciación a Bases de datos SQL', 6.5, 1);

insert into cursoOnline (id, nombre, puntuacion, profesor_id)
values (NEXTVAL('HIBERNATE_SEQUENCE'), 'Curso medio de Bases de datos SQL', 5.4, 1);

insert into cursoOnline (id, nombre, puntuacion, profesor_id)
values (NEXTVAL('HIBERNATE_SEQUENCE'), 'Frontend con Angular2', 7.2, 2);

insert into cursoOnline (id, nombre, puntuacion, profesor_id)
values (NEXTVAL('HIBERNATE_SEQUENCE'), 'Curso medio de Desarrollador de Unity', 8.3, 3);

--Video
insert into video (id, orden, titulo, descripcion, url, cursoOnline_id)
values (NEXTVAL('HIBERNATE_SEQUENCE'), 1,'Presentación del curso', 'Aquí me presento y muestro lo que vamos a tratar en el curso', 'http://cursosOnline.es/91828731/1',1);

insert into video (id, orden, titulo, descripcion, url, cursoOnline_id)
values (NEXTVAL('HIBERNATE_SEQUENCE'), 5,'Creación de los servicios', 'Veremos los criterios a tener en cuenta para crear un servicio y las veces en las que no es necesario', 'http://cursosOnline.es/7826453/5',2);

insert into video (id, orden, titulo, descripcion, url, cursoOnline_id)
values (NEXTVAL('HIBERNATE_SEQUENCE'), 2,'Primer encuentro con Unity', 'Configuramos Unity por primera vez, y creamos el primer ejemplo', 'http://cursosOnline.es/2827462/2',3);
