
CREATE DATABASE dbusuario;
USE dbusuario;

CREATE TABLE notas(
	id INT PRIMARY KEY AUTO_INCREMENT,
	titulo VARCHAR(45),
	descripcion VARCHAR(125),
	fecha VARCHAR(20),
	usuario VARCHAR(25)
);