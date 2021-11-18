create table usuario (
    id serial not null primary key,
    documento varchar(100) not null,
    nombres varchar(45) not null,
    apellidos varchar(45) not null,
    celular varchar(45) not null,
    email varchar(45) not null,
    fecha_nacimiento date not null,
    password varchar not null,
    created_at timestamp NOT NULL DEFAULT now(),
    updated_at timestamp NOT NULL DEFAULT now()
);

CREATE TABLE escenario (
	id serial NOT NULL primary key,
	nombre varchar(100) NOT NULL,
	direccion varchar NOT NULL,
	valor integer NOT NULL,
	horaInicial smallint NOT NULL,
	horaFinal smallint NOT NULL,
	imagen varchar NOT NULL,
	created_at timestamp NOT NULL DEFAULT now(),
	updated_at timestamp NOT NULL DEFAULT now()
);

CREATE TABLE reserva (
	id serial NOT NULL primary key,
	fecha date NOT NULL,
	hora smallint NOT NULL,
	estado varchar NOT NULL DEFAULT 'RESERVADO',
	valor integer NOT NULL,
	created_at timestamp NOT NULL DEFAULT now(),
	updated_at timestamp NOT NULL DEFAULT now(),
	escenario_id serial NOT NULL,
	usuario_id serial NOT NULL,
	CONSTRAINT "FK_reserva_escenario" FOREIGN KEY (escenario_id) REFERENCES escenario(id),
	CONSTRAINT "FK_reserva_usuario" FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

