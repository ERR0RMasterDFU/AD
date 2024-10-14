--- ALUMNO ---------------------------------------------------------------------------------------------------

INSERT INTO alumno (id, nombre, apellidos, direccion, telefono, email, fechaNac) VALUES (1, 'Chihiro', 'Rokuhira', 'Katanazo', 'Kagur-abachi', 'Kagurabachi@Chihiro.com', '03/03/2005');
INSERT INTO alumno (id, nombre, apellidos, direccion, telefono, email, fechaNac) VALUES (2, 'Naruto', 'Uzumaki', 'Shipudden', 'Boruto', 'Kishimoto@Na.com', '05/12/2006');
INSERT INTO alumno (id, nombre, apellidos, direccion, telefono, email, fechaNac) VALUES (3, 'Alphonse', 'Elric', 'Fullmetal', 'Alchemist', 'Brotherhood@Hohenheim.com', '09/07/2004');
INSERT INTO alumno (id, nombre, apellidos, direccion, telefono, email, fechaNac) VALUES (4, 'Luffy', 'Monkey D', 'Gomu gomu no', 'One Piece', 'Two@Pieces.com', '22/09/2005');
INSERT INTO alumno (id, nombre, apellidos, direccion, telefono, email, fechaNac) VALUES (5, 'Ichigo', 'Kurosaki', 'Bankai', 'Bleach', 'CuartaTemp@ya.com', '14/02/2004');

ALTER SEQUENCE alumno_seq RESTART WITH 53;


--- CURSO --------------------------------------------------------------------------------------------------

INSERT INTO curso (id, nombre, tipo) VALUES (1, '1ºNuevo', 'BÁSICO');
INSERT INTO curso (id, nombre, tipo) VALUES (2, '1ºMedio', 'MEDIO');
INSERT INTO curso (id, nombre, tipo) VALUES (3, '1ºViejo', 'SUPERIOR');
INSERT INTO curso (id, nombre, tipo) VALUES (4, '2ºNuevo', 'MEDIO');
INSERT INTO curso (id, nombre, tipo) VALUES (5, '2ºMedio', 'SUPERIOR');

ALTER SEQUENCE curso_seq RESTART WITH 55;


--- ASIGNATURAS -----------------------------------------------------------------------------------------------------

INSERT INTO asignatura (id, nombre, numHoras, contenidos, curso) VALUES (1, 'Matemáticas', 30, 'Sumar', 1);
INSERT INTO asignatura (id, nombre, numHoras, contenidos, curso) VALUES (2, 'Lengua', 35, 'Hablar', 2);
INSERT INTO asignatura (id, nombre, numHoras, contenidos, curso) VALUES (3, 'Biología', 23, 'Observar', 3);
INSERT INTO asignatura (id, nombre, numHoras, contenidos, curso) VALUES (4, 'Historia', 15, 'Aprender', 4);
INSERT INTO asignatura (id, nombre, numHoras, contenidos, curso) VALUES (5, 'Física', 5, 'Realidad', 5);
INSERT INTO asignatura (id, nombre, numHoras, contenidos, curso) VALUES (6, 'Inglés', 32, 'English', 2);
INSERT INTO asignatura (id, nombre, numHoras, contenidos, curso) VALUES (7, 'Química', 26, 'Formulación', 4);
INSERT INTO asignatura (id, nombre, numHoras, contenidos, curso) VALUES (8, 'Educación física', 28, 'A sudar', 1);

ALTER SEQUENCE asignatura_seq RESTART WITH 58;


--- MATRÍCULA NOTAS -----------------------------------------------------------------------------------------------------

INSERT INTO matricula_notas (anyo, nota, alumno, asignatura) VALUES (2005, 7.20, 1, 1);
INSERT INTO matricula_notas (anyo, nota, alumno, asignatura) VALUES (2006, 8.40, 2, 7);
INSERT INTO matricula_notas (anyo, nota, alumno, asignatura) VALUES (2004, 6.50, 3, 4);
INSERT INTO matricula_notas (anyo, nota, alumno, asignatura) VALUES (2005, 8.00, 4, 3);
INSERT INTO matricula_notas (anyo, nota, alumno, asignatura) VALUES (2004, 4.99, 5, 2);

ALTER SEQUENCE matricula_notas_seq RESTART WITH 58;

