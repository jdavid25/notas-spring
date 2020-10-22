/* Populate tabla estudiantes */
INSERT INTO estudiantes (codigo, nombre) VALUES('est01','Andrés Guzmán');
INSERT INTO estudiantes (codigo, nombre) VALUES('est02','Edgar Poe');
INSERT INTO estudiantes (codigo, nombre) VALUES('est03','Garcia Marquez');

/* Populate tabla materia */
INSERT INTO materias (nombre) VALUES('calculo diferencial');
INSERT INTO materias (nombre) VALUES('calculo integral');
INSERT INTO materias (nombre) VALUES('calculo vectorial');


/* Populate tabla semestre */
INSERT INTO semestres (semestre) VALUES('2020-1');
INSERT INTO semestres (semestre) VALUES('2020-2');


/* Populate tabla nota */
INSERT INTO notas (nota, estudiante_id, materia_id, semestre_id) VALUES(4.1,1,1,1);
INSERT INTO notas (nota, estudiante_id, materia_id, semestre_id) VALUES(3.1,1,1,1);
INSERT INTO notas (nota, estudiante_id, materia_id, semestre_id) VALUES(2.1,1,1,1);


INSERT INTO notas (nota, estudiante_id, materia_id, semestre_id) VALUES(2,1,2,1);
INSERT INTO notas (nota, estudiante_id, materia_id, semestre_id) VALUES(3,1,2,1);
INSERT INTO notas (nota, estudiante_id, materia_id, semestre_id) VALUES(3,1,2,1);


INSERT INTO notas (nota, estudiante_id, materia_id, semestre_id) VALUES(5,2,1,2);
INSERT INTO notas (nota, estudiante_id, materia_id, semestre_id) VALUES(3,2,1,2);
INSERT INTO notas (nota, estudiante_id, materia_id, semestre_id) VALUES(1,2,1,2);