SELECT id, nombre, direccion, valor, horainicial, horafinal, imagen, created_at, updated_at
FROM escenario
ORDER BY id
LIMIT :limit OFFSET :offSet;

