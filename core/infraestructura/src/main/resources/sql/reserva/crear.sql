INSERT INTO reserva
(fecha, hora, estado, valor, created_at, updated_at, escenario_id, usuario_id)
VALUES(:fecha, :hora, :estado, :valor, now(), now(), :escenarioId, :usuarioId);
