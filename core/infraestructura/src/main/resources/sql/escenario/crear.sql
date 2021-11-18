INSERT INTO escenario
(nombre, direccion, valor, horainicial, horafinal, imagen, created_at, updated_at)
VALUES(:nombre, :direccion, :valor, :horaInicial, :horaFinal, :imagen, now(), now());

