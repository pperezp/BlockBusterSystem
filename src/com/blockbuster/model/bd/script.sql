CREATE DATABASE bd_blockbuster;

USE bd_blockbuster;

CREATE TABLE genero(
    id INT AUTO_INCREMENT,
    descripcion VARCHAR(100),
    PRIMARY KEY(id)
);

CREATE TABLE formato(
    id INT AUTO_INCREMENT,
    descripcion VARCHAR(100),
    PRIMARY KEY(id)
);

CREATE TABLE pelicula(
    id INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    anio INT,
    director VARCHAR(100),
    descripcion VARCHAR(500),
    restriccion INT,
    PRIMARY KEY(id)
);

CREATE TABLE peliculaFormato(
    id INT AUTO_INCREMENT,
    stock INT,
    precio INT,
    fk_pelicula INT,
    fk_formato INT,
    PRIMARY KEY(id),
    FOREIGN KEY(fk_pelicula) REFERENCES pelicula(id),
    FOREIGN KEY(fk_formato) REFERENCES formato(id)
);

CREATE TABLE generoPelicula(
    id INT AUTO_INCREMENT,
    fkGenero INT,
    fkPelicula INT,
    PRIMARY KEY(id),
    FOREIGN KEY(fkGenero) REFERENCES genero(id),
    FOREIGN KEY(fkPelicula) REFERENCES pelicula(id)
);

CREATE TABLE cliente(
    id INT AUTO_INCREMENT,
    run VARCHAR(13),
    nombre VARCHAR(100),
    direccion VARCHAR(200),
    fechaNacimiento DATE,
    PRIMARY KEY(id)
);

CREATE TABLE empleado(
    id INT AUTO_INCREMENT,
    run VARCHAR(13),
    nombre VARCHAR(100),
    PRIMARY KEY(id)
);

CREATE TABLE prestamo(
    id INT AUTO_INCREMENT,
    fecha DATETIME,
    fk_empleado INT,
    fk_cliente INT,
    fk_peliculaFormato INT,
    fechaEntrega DATE,
    precioExtra INT,
    PRIMARY KEY(id)
);

CREATE TABLE entrega(
    id INT AUTO_INCREMENT,
    fecha DATETIME,
    fk_prestamo INT,
    estadoProducto VARCHAR(200),
    precioExtra INT,
    PRIMARY KEY(id)
);

/*INSERTS*/
INSERT INTO genero VALUES(NULL, 'Terror');  
INSERT INTO genero VALUES(NULL, 'Acción');
INSERT INTO genero VALUES(NULL, 'Comedia');
INSERT INTO genero VALUES(NULL, 'Animada');
INSERT INTO genero VALUES(NULL, 'Infantil');
INSERT INTO genero VALUES(NULL, 'Adulto');
INSERT INTO genero VALUES(NULL, 'Thriller');
INSERT INTO genero VALUES(NULL, 'Drama');
INSERT INTO genero VALUES(NULL, 'Horror');
INSERT INTO genero VALUES(NULL, 'Suspenso');
INSERT INTO genero VALUES(NULL, 'Ciencia Ficción');
INSERT INTO genero VALUES(NULL, 'Aventura épica');
INSERT INTO genero VALUES(NULL, 'Romántica');
INSERT INTO genero VALUES(NULL, 'Fantasía');

INSERT INTO formato VALUES(NULL, 'DVD');
INSERT INTO formato VALUES(NULL, 'VHS');
INSERT INTO formato VALUES(NULL, 'BlueRay');
INSERT INTO formato VALUES(NULL, 'Digital');

INSERT INTO pelicula VALUES(NULL, 'Shrek I','2000','Roberto I7','Descripción de shrek', '0');
INSERT INTO pelicula VALUES(NULL, 'La fuga del camión sin ruedas','1963','Mr. Cordero','Descripción de La fuga', '15');

INSERT INTO peliculaFormato VALUES(NULL, '5','1000','1','1');/*SHREK --> DVD*/
INSERT INTO peliculaFormato VALUES(NULL, '2','3000','1','3');/*SHREK --> BR*/

/*LFDCSR --> **/
INSERT INTO peliculaFormato VALUES(NULL, '6','500', '2','1');/*LFDCSR --> **/
INSERT INTO peliculaFormato VALUES(NULL, '20','15000','2','2');/*LFDCSR --> **/
INSERT INTO peliculaFormato VALUES(NULL, '1','30000','2','3');/*LFDCSR --> **/
INSERT INTO peliculaFormato VALUES(NULL, '1','1500','2','4');/*LFDCSR --> **/

/*INSERTS de shrek*/
INSERT INTO generoPelicula VALUES(NULL, '3','1');
INSERT INTO generoPelicula VALUES(NULL, '4','1');
INSERT INTO generoPelicula VALUES(NULL, '5','1');
/*INSERTS de shrek*/

/*INSERTS de LFDCSR*/
INSERT INTO generoPelicula VALUES(NULL, '2','2');
INSERT INTO generoPelicula VALUES(NULL, '10','2');
INSERT INTO generoPelicula VALUES(NULL, '12','2');
INSERT INTO generoPelicula VALUES(NULL, '1','2');
INSERT INTO generoPelicula VALUES(NULL, '6','2');
/*INSERTS de LFDCSR*/

INSERT INTO cliente VALUES(NULL, '11-1','Max','dir1','2008-01-02');
INSERT INTO cliente VALUES(NULL, '22-2','IZIN','dir2','1997-12-5');
INSERT INTO cliente VALUES(NULL, '33-3','Chiquitin','dir3','2000-04-30');
INSERT INTO cliente VALUES(NULL, '44-4','Jim Morrinson','dir4','1996-09-07');
INSERT INTO cliente VALUES(NULL, '55-5','Tapia','dir5','1943-05-01');
INSERT INTO cliente VALUES(NULL, '66-6','Torres','dir6','1996-01-01');
INSERT INTO cliente VALUES(NULL, '77-7','Mr. Cordero','dir7','1999-03-15');
INSERT INTO cliente VALUES(NULL, '88-8','Toro','dir8','2005-04-01');

INSERT INTO empleado VALUES(NULL, '99-9','Zuñiga');
INSERT INTO empleado VALUES(NULL, '10-10','Joselito');
/*INSERTS*/

/*SELECTs*/
SELECT * FROM genero;
SELECT * FROM formato;
SELECT * FROM pelicula;
SELECT * FROM peliculaFormato;
SELECT * FROM generoPelicula;
SELECT * FROM cliente;
SELECT * FROM empleado;
SELECT * FROM prestamo;
/*SELECTs*/

/*DROPS*/
DROP TABLE empleado;
DROP TABLE prestamo;
DROP TABLE cliente;
DROP TABLE generoPelicula;
DROP TABLE pelicula;
DROP TABLE genero;

DELETE FROM cliente;
TRUNCATE TABLE cliente;

DROP DATABASE bd_blockbuster;
/*DROPS*/