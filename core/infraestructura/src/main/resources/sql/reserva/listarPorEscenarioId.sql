SELECT id, fecha, hora, estado, valor, created_at, updated_at, escenario_id, usuario_id
FROM reserva
where escenario_id = :id;
